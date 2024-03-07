import '../styles/Background.css';

export function Background() {

  return (
    <>
      <div className='orbit-container'>
        <div className="inner-orbit">
          <div className="inner-orbit-cirlces"></div>
        </div>
      </div>

      <div className='orbit-container'>
        <div id="inner-orbit-bottom" className='inner-orbit'>
          <div id='inner-orbit-circle-bot' className="inner-orbit-cirlces"></div>
        </div>
      </div>
    </>
  );
}
