import axios from 'axios';
import { useContext } from 'react';
import { useState } from 'react';
import { Navigate } from 'react-router-dom';
import User from '../../context/Provider.jsx';
import { useForm } from '../../hooks/useForm.js';
import './Login.css';

export const Login = () => {
	const { setUser } = useContext(User);

	const { id, password, inputChange, form } = useForm({
		id: '',
		password: '',
	});

	const [login, setLogin] = useState(0);

	const val = (e) => {
		e.preventDefault();
		axios
			.post('http://localhost:8080/client/validate', form)
			.then((res) => {
				if (res.data.namePerson) {
					setLogin(1);
					setUser(res.data);
				} else {
					setLogin(2);
				}
			});
	};

	if (login === 1) {
		return <Navigate to="/inicio" />;
	}

	return (
		<div className="contenedor">
			<div className="card2">
				<h2>La Pape</h2>
				<input
					type="text"
					className="form-control mb-3"
					name="id"
					value={id}
					onChange={inputChange}
					placeholder="Id de usuario"
				/>
				<input
					type="password"
					className="form-control mb-3"
					name="password"
					value={password}
					onChange={inputChange}
					placeholder="Password de usuario"
				/>
				{login > 1 ? (
					<p style={{ color: 'red' }}>Correo o password invalido</p>
				) : (
					''
				)}
				<button className="btn btn-primary" onClick={val}>
					Iniciar sesion
				</button>
			</div>
		</div>
	);
};
