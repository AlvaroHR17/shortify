import { useState } from 'react';
import axios from 'axios';
import '../styles/Search.css';

export function Search() {

  const [url, setUrl] = useState("");

  const handleKeyDown = (event: React.KeyboardEvent) => {
    if (event.key === 'Enter') {
      axios.post('http://localhost:8092/api/v1?url=' + encodeURIComponent(url))
        .then(response => console.log(response))
        .catch(error => console.error(error));
        //TODO: give to the user the new URL.
    }
  }

  return (
    <>
      <div className='flex flex-col items-center'>
        <h1 className='uppercase text-8xl font-semibold mt-32 text-shadow'>Sortify</h1>
        <h2 className='font-medium uppercase mt-12 text-shadow'>Shorten your links</h2>
        <input
          style={{boxShadow: '5px 5px 20px 7px #111'}}
          className='max-w-xl w-1/3 h-16 rounded-xl text-2xl text-right pr-5 mt-24 drop-shadow-lg text-gray-900' 
          type="text"
          placeholder='Enter your URL' 
          onChange={e => setUrl(e.target.value)}
          onKeyDown={handleKeyDown}
          value={url}
        />
      </div>
    </>
  );
}
