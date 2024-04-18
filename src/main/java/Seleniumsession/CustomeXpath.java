package Seleniumsession;

import org.openqa.selenium.By;

public class CustomeXpath {

	public static void main(String[] args) {

		// Xpath: address of the element in the DOM
		// XMLPath
		// 1. absolute xpath
		// html/body/div[2]/div/div/div[3]/div[2]/div/div/div[2]/h4/a
		// 2. relative xpath(custom xpath)

		// 1. using single attr:
		// tagname[@attrname = 'value']
		// input[@id = 'input-email']
		// input[@name='email']

		// input[@name] --5
		// input[@value='Login'] --1

		// 2. Uisng the mutiple attrbute
		// tagname[@attrName='value' and @attrname='value'] ---And TO get uniqe element
		// input[@type="submit" and @value="Login"]--1

		// input[@type="submit"]---3

		// input[@type="text" or @type="email"] ----Or Include all this or this
		// input[@type and @value="Login"]---1
		// input[@type and @value]
		//// form//input[@type='text' or @type='password']
		
		// a[@href] --Give me all the links ,URL,Having href properties

		// 3. text()
		// tagname[text()='value']
		// h2[text()='Returning Customer']---1
		// a[text()='Wish List']
		// a[text()='Desktops']

		// 4.text() and attribute

		// tagname[@attrname='value' and text()='value']-I am looking for WE ,which have
		// attribute and text
		// a[@class="dropdown-toggle" and text()='Desktops']
		// a[@class="dropdown-toggle" and text()='Desktops' and
		// @data-toggle="dropdown"]: seprate by and for att @ :give me all a which bla
		// a[text()='Desktops' and @class="dropdown-toggle" and @data-toggle="dropdown"]

		// 5.contains with attribute
		// tagname[contains(@attrName,'value')]
		// input[contains(@placeholder,"E-Mail ")]
		// input[contains(@placeholder,"Address")]
		// input[contains(@placeholder,"Address") and @name="email"]
		// input[contains(@placeholder,"Address") and @name="email" and
		// contains(@id,'email')]
		// input[contains(@placeholder,"Address") and @id="input-email" and
		// contains(@name,'email')]
		// a[contains(@href,"wishlist")]---3 --in the case of links--findelemet -1 and
		// findelemnts --for specicfic indexing

		// dynamic ids:
		// <input id=firstname_123 />
		// <input id=firstname_345 />
		// <input id=firstname_900 />
		// <input id=firstname_987 />

		// input[contains(@id,'firstname_')]

		// Cant use By.id : coniats(@id,'firstname_')

		// contains() with text();
		// htmltag[contains(text(),'value')]
		// p[contains(text(),'Customer service, IT, and CRM software')]: P means pragrah
		// : I dont want to use such long text : P contains "Customer service, IT, and
		// CRM software" give me that
		// //a[contains(text(),'Customer ')]

		// 7. contains with text() and attribute
		// tagname[contains(text(),'value') and contains(@attname,'value')]
		// a[contains(text(),'Notebooks') and contains(@href,'category&path')]--2

		// tagname[contains(text(),'value') and contains(@att1,'value')and @attr2=value]
		// a[contains(text(),'Notebooks') and contains(@href,'category&path') and
		// @class="dropdown-toggle"]--1

		// 8. startWith()
		// tagName[starts-with(@attr,value)]
		// input[starts-with(@placeholder,"E-Mail")]

		// 9. starts-with text()
		// a[starts-with(text(),'Forgotten ')]

		// dynamic ids:
		// <input id=firstname_123_login />
		// <input id=456_firstname_login />
		// Both conatanis and starts-with() is used for dynamic ids

		// 10. ends-with ? : no we dont have ends-with

		// index-based xpath -capture group and the apply indexing
		// (//a[text()='Forgotten Password'])[1]
		// (//a[@class="list-group-item"])[13]

		By for_pass = By.xpath("(//a[text()='Forgotten Password'])[1]");
		// (//input[@class="form-control"])[6]
		// (//input[@class="form-control"])[position()=4]-can be used any one
		// (//input[@class="form-control"])[2] --Both are same position() is more
		// readable -thats why given
		// (//input[@class="form-control"])[last()]
		// (//input[@class="form-control"])[last()-1]
		// (//input[@class="form-control"])[first()]? Not allowed

		// ((//div[@class="navFooterLinkCol navAccessibility"])[last()]//a)[last()]
		// ((//div[@class="navFooterLinkCol navAccessibility"])[last()-1]//a)[last()]
		// ((//div[@class="navFooterLinkCol navAccessibility"])[last()-1]//a)[last()-1]
		// ((//div[@class="navFooterLinkCol
		// navAccessibility"])[last()-1]//a)[last()-last()]: zero not a maths
		// ((//div[@class="navFooterLinkCol
		// navAccessibility"])[last()-1]//a)[last()-last()+1]

	}

}
