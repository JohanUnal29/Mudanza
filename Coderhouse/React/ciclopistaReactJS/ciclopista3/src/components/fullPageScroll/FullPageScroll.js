import React from 'react';
import Fullpage,{FullPageSections,FullpageSection,FullpageNavigation} from '@ap.cx/react-fullpage';
import './FullPageScroll.css'

const FullPageScroll = () => {
    return(
        <Fullpage>
            <FullpageNavigation></FullpageNavigation>
            <FullPageSections>
                <FullpageSection className="FullPageScroll1">
                    <h1>
                        Screen 1
                    </h1>
                </FullpageSection>
                <FullpageSection className="FullPageScroll2">
                    <h1>
                        Screen 2
                    </h1>
                </FullpageSection>
                <FullpageSection className="FullPageScroll3">
                    <h1>
                        Screen 3
                    </h1>
                </FullpageSection>
                <FullpageSection className="FullPageScroll3">
                    <h1>
                        Screen 4
                    </h1>
                </FullpageSection>
            </FullPageSections>
        </Fullpage>
    );
};

export default FullPageScroll;