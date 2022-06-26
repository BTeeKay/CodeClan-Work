import React from "react";

const Pricing = ({pricing}) => {

  const priceNodes = pricing.map((price) => {
    return <li>{price.level} costs {price.cost}</li>
  })

  return (
    <ul>
      {priceNodes}
    </ul>
  )
  };

export default Pricing;
