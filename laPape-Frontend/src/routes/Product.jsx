import { Route, Routes } from 'react-router-dom';
import { Cart } from '../components/Cart/Cart.jsx';
import { Inicio } from '../components/Inicio/Inicio.jsx';
import { NavBar } from '../components/NavBar/NavBar.jsx';
import { ProductList } from '../components/Products/ProductList.jsx';

export const Product = () => {
	return (
		<>
			<NavBar />
			<Routes>
				<Route path="inicio" element={<Inicio />} />
				<Route path="productos" element={<ProductList />} />
				<Route path="carrito" element={<Cart />} />
			</Routes>
		</>
	);
};
