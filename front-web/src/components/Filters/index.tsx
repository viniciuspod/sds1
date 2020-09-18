import React from 'react';
import { Link } from 'react-router-dom';


type Props = {
    link: string;
    linkText: string;
}


const Filtes = ({link, linkText}: Props) =>(
    <div className="filters-container records-actions">
        <Link to={link}>
            <button className="action-filters">
                 {linkText}
            </button>
        </Link>
    </div>
);

export default Filtes;