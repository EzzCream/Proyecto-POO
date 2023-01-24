import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import { Login } from './components/Login/Login.jsx';
import { Product } from './routes/Product.jsx';
import { Provider } from './context/Provider.jsx';

function App() {
	return (
		<div className="App">
			<Provider>
				<BrowserRouter>
					<Routes>
						<Route path="/login" element={<Login />} />
						<Route path="/*" element={<Product />} />
					</Routes>
				</BrowserRouter>
			</Provider>
		</div>
	);
}

export default App;
