import { createContext, useState } from 'react';

const User = createContext();

export const Provider = ({ children }) => {
	const [user, setUser] = useState([]);

	return (
		<User.Provider
			value={{
				user,
				setUser,
			}}
		>
			{children}
		</User.Provider>
	);
};

export default User;
