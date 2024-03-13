import { Routes, Route } from 'react-router-dom'
import { Search } from './Search'
import Redirect from './Redirect'

export const Main = () => {
    return (
        <Routes>
            <Route path='/' element={ <Search /> } />
            <Route path=':id' element={<Redirect />} />   
        </Routes>
    )
}