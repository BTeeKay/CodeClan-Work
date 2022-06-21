import React from 'react';
import Calculator from '../containers/Calculator';
import {render, fireEvent} from '@testing-library/react';

describe('Calculator', () => {
  let container;
  let button1, button2, button4, button5, button7;
  let add, equal, divide, multiply, subtract;


  beforeEach(() => {
    container = render(<Calculator/>)
    button1 = container.getByTestId('number1');
    button2 = container.getByTestId('number2');
    button4 = container.getByTestId('number4');
    button5 = container.getByTestId('number5');
    button7 = container.getByTestId('number7');
    add = container.getByTestId('operator-add');
    equal = container.getByTestId('operator-equals');
    subtract = container.getByTestId('operator-subtract');
    divide = container.getByTestId('operator-divide');
    multiply = container.getByTestId('operator-multiply');
  })

  it('should change running total on number enter', () => {
    const button4 = container.getByTestId('number4');
    const runningTotal = container.getByTestId('running-total');
    fireEvent.click(button4);
    expect(runningTotal.textContent).toEqual('4');
  })

  it('should concatenate multiple number button clicks', () => {
    fireEvent.click(button1);
    fireEvent.click(button2);
    const runningTotal = container.getByTestId('running-total');
    expect(runningTotal.textContent).toEqual('12');
  })

  it('should add 1 to 4 and get 5', () => {
    fireEvent.click(button1);
    fireEvent.click(add);
    fireEvent.click(button4);
    fireEvent.click(equal);
    const runningTotal = container.getByTestId('running-total');
    expect(runningTotal.textContent).toEqual('5');
  })
})

