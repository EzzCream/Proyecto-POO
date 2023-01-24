import axios from 'axios';
import { useContext, useEffect, useState } from 'react';
import User from '../../context/Provider.jsx';
import './ProductList.css';

export const ProductList = () => {
	const { user } = useContext(User);

	const [products, setProducts] = useState([]);
	const [cart, setCart] = useState();
	const [produ, setProd] = useState();

	useEffect(() => {
		axios.get('http://localhost:8080/products/getAll').then((res) => {
			setProducts(res.data);
		});
	}, []);

	return (
		<div className="prodCont">
			<h2 className="display-2 mb-3">Productos</h2>
			{products.map((prod) => {
				const addToCart = () => {
					console.log(prod.id);
					axios
						.get(
							`http://localhost:8080/cart/getCart/${user.idCart}`,
						)
						.then((res) => {
							console.log(res.data);
							setCart(res.data);
							axios
								.get(
									`http://localhost:8080/products/getById/${prod.id}`,
								)
								.then((prod) => {
									setProd(prod.data);
									cart.productsInCart.push(produ);
									console.log(cart);
									axios
										.post(
											'http://localhost:8080/cart/update',
											cart,
										)
										.then((res) => console.log(res));
								});
						});
				};

				return (
					<div className="card1" key={prod.id}>
						<div className="image">
							<span className="text">{prod.nameProduct}</span>
						</div>
						<h2 className="title">{prod.detailProduct}</h2>
						<span className="price">${prod.price}</span>
						<button className="btn btn-primary" onClick={addToCart}>
							Agregar al carrito
						</button>
					</div>
				);
			})}
		</div>
	);
};
