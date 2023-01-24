import { Link } from 'react-router-dom';

export const NavBar = () => {
	return (
		<div>
			<nav className="navbar bg-light">
				<div className="container-fluid">
					<Link className="navbar-brand" to="/inicio">
						LaPape
					</Link>
					<Link className="navbar-brand" to="/productos">
						Productos
					</Link>
					<Link className="navbar-brand" to="/carrito">
						Carrito
					</Link>
				</div>
			</nav>
		</div>
	);
};
