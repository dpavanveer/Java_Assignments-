package com.springrest4.control;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/validate/{cardNo}",method = RequestMethod.GET)

    public String validateCreditCard(@PathVariable("cardNo") String cardNo){
        Controller cardValidator = new Controller();
        cardValidator.setCardNo(cardNo);
        String res = cardValidator.isValidCard();
        return  res;
    }

	private void setCardNo(String cardNo) {
		// TODO Auto-generated method stub
		
	}

	private String isValidCard() {
		// TODO Auto-generated method stub
		return null;
	}
}