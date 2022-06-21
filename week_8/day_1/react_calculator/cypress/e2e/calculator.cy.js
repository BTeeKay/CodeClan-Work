describe("Calculator", () => {
  beforeEach(() => {
    cy.visit("http://localhost:3000");
  })

  it('should have working number buttons', () => {
    cy.get('#number2').click();
    cy.get('.display').should('contain', '2')
  })

  it('should be able to add one and two', () => {
    cy.get('#number1').click();
    cy.get("#operator-add").click();
    cy.get('#number2').click();
    cy.get('#operator-equals').click();
    cy.get(".display").should('contain', '3')
  })

  it('should be able to divide ten by two', () => {
    cy.get('#number1').click();
    cy.get('#number0').click();
    cy.get("#operator-divide").click();
    cy.get('#number2').click();
    cy.get('#operator-equals').click();
    cy.get(".display").should('contain', '5')
  })

  it('should be able to add two numbers and then multiply the answer', () => {
    cy.get('#number5').click();
    cy.get("#operator-add").click();
    cy.get('#number5').click();
    cy.get('#operator-equals').click();
    cy.get('#operator-multiply').click();
    cy.get('#number2').click();
    cy.get('#operator-equals').click();
    cy.get(".display").should('contain', '20')
  })

  it('should be able to do a large negative number sum', () => {
    cy.get('#number5').click();
    cy.get('#operator-subtract').click(0);
    cy.get('#number1').click();
    cy.get('#number0').click();
    cy.get('#number0').click();
    cy.get('#operator-equals').click();
    cy.get('#operator-multiply').click();
    cy.get('#number9').click();
    cy.get('#number9').click();
    cy.get('#operator-equals').click();
    cy.get(".display").should('contain', '-9405') 
  })

  it('should give error when dividing by zero', () => {
    cy.get('#number9').click();
    cy.get('#operator-divide').click();
    cy.get('#number0').click();
    cy.get('#operator-equals').click();
    cy.get(".display").should('contain', 'Cannot Divide by Zero')
  })

  
})