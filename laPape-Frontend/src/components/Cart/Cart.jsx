import axios from 'axios';
import { useState } from 'react';
import { useContext, useEffect } from 'react';
import User from '../../context/Provider.jsx';
import './Cart.css';

export const Cart = () => {
	const { user } = useContext(User);

	const [prodC, setProdC] = useState([]);

	useEffect(() => {
		axios
			.get(`http://localhost:8080/cart/getCart/${user.idCart}`)
			.then((res) => {
				setProdC(res.data.productsInCart);
			});
	}, []);

	const genOrd = () => {
		const orden = {
			address: user.address,
			namePerson: user.namePerson,
			totalPrice: 500,
			paymentMethod: user.paymentMethod,
			products: prodC,
		};
		const cartN = {
			id: user.idCart,
			productsInCart: [],
		};
		axios
			.post(`http://localhost:8080/order/create/${user.id}`, orden)
			.then((res) => {
				console.log(res.data);
				axios
					.post(`http://localhost:8080/cart/update`, cartN)
					.then((res) => console.log(res.data));
			});
	};

	return (
		<div className="as p-3">
			<h2>Carrito</h2>
			<div className="cardCart">
				{prodC.map((res) => {
					return (
						<div className="c">
							<p>{res.nameProduct}</p>
							<p>{res.detailsProduct}</p>
							<p>precio: {res.price}</p>
						</div>
					);
				})}
			</div>
			<button className="btn btn-primary" onClick={genOrd}>
				Generar Orden
			</button>
		</div>
	);
};
