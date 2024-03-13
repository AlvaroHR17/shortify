import axios from "axios";
import React, { useEffect } from "react";
import { useParams } from "react-router-dom";


const Redirect = () => {
    const { id } = useParams()

    useEffect(() => {
        axios.get('http://localhost:8092/api/v1/' + id)
        .then(response => {
            const { url } = response.data
            window.location.href = url;
        })
        .catch(error => console.error(error))
    }, [id])

    //TODO: create a Loading page to show while the redirection
    return (
        <div>
            <h2>Item Detail Page</h2>
            <p>Item ID: {id}</p>
        </div>
    );
}

export default Redirect;