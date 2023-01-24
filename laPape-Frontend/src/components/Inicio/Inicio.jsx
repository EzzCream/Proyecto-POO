import { useContext } from 'react';
import User from '../../context/Provider.jsx';
import './Inicio.css';

export const Inicio = () => {
	const { user } = useContext(User);

	return (
		<div>
			<div className="start">
				<h1 className="display-1">La Pape - Papeleria ecommerce</h1>
				<h2 className="display-6">Bienvenido {user.username}</h2>
			</div>
		</div>
	);
};
