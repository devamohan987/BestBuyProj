package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class AddAnItem extends ProjectSpecification {

	@FindBy(id="gh-search-input")
	WebElement search;
	
	@FindBy(xpath="//button[@class='header-search-button']")
	WebElement searchbutton;
	
	@FindBy(xpath="//img[@alt='Apple - Geek Squad Certified Refurbished AirPods (3rd generation) with Lightning Charging Case - White - Front_Zoom']")
	WebElement selectitem;
	
	@FindBy(xpath="(//button[text()='Add to Cart'])[1]")
	WebElement addtocart;
	
	@FindBy(xpath="//button[@data-track='Attach Modal: Continue shopping']")
	WebElement continueshopping;

	@FindBy(xpath="//button[@data-t='hamburger-navigation-button']")
	WebElement menu;
	
	@FindBy(xpath="(//button[@type='button'])[8]")
	WebElement computers;
	
	@FindBy(xpath="//button[text()='Tablets']")
	WebElement tablet;
	
	@FindBy(xpath="//a[text()='Samsung Galaxy Tablets']")
	WebElement galaxytab;
	
	@FindBy(xpath="(//a[text()='Samsung Galaxy Tab S9'])[1]")
	WebElement galaxyultra;
	
	@FindBy(xpath="//a[contains(text(),' 128GB - Wi-Fi - with S-Pen - Graphite')]")
	WebElement selectanitem1;
	
	
	@FindBy(xpath="(//button[@type='button'])[5]")
	WebElement brands;
	
	@FindBy(xpath="//a[text()='Sony']")
	WebElement sony;
	
	
	@FindBy(xpath="//a[text()='Sony headphones']")
	WebElement headphone;
	
			
	@FindBy(xpath="//a[text()='Sony - WH1000XM4 Wireless Noise-Cancelling Over-the-Ear Headphones - Black']")
	WebElement selectanitem2;
	
	@FindBy(xpath="//span[@class='added-to-cart']")
	WebElement itemaddedtocart;
	
	@FindBy(xpath="//a[text()='Go to Cart']")
	WebElement gotocart;
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkout;
	
	@FindBy(xpath="//button[text()='Continue as Guest']")
	WebElement continueasguest;
	
	@FindBy(id="user.emailAddress")
	WebElement email;
	
	@FindBy(id="user.phone")
	WebElement phoneno;
	
	@FindBy(xpath="//span[text()='Continue to Payment Information']")
	WebElement continuepayment;
	
	@FindBy(xpath="//input[@id='number']")
	WebElement card;
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='street']")
	WebElement address;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath="//select[@id='state']")
	WebElement state;
	
	@FindBy(xpath="//input[@id='zipcode']")
	WebElement zip;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement placeorder;
	
	@FindBy(xpath="//button[@class='c-button-link card-call-to-action-button']")
	WebElement switch_ship;
	
	@FindBy(xpath="//button[@class='c-button c-button-secondary c-button-md ']")
	WebElement enteraddress;
	
	@FindBy(xpath="//button[@class='c-button c-button-secondary c-button-md new-address-form__button']")
	WebElement apply;
	
	@FindBy(xpath="//button[@class='c-button-link cart-item__remove']")
	WebElement remove;
	
	
	@FindBy(xpath="//h1[@class='heading-5 page-heading__title']")
	WebElement cartisempty;
	
	@FindBy(xpath="//div[text()='$0.00']")
	WebElement total;
	
	@FindBy(xpath="//span[text()='Save']")
	WebElement savebutton;
	
	@FindBy(xpath="//a[text()='My Saved Items']")
	WebElement mysaveditem;
	
	@FindBy(xpath="//div[@class='pb-150']")
	WebElement saved_msg;
	
	@FindBy(xpath="(//a[text()='Black Friday Deals'])[3]")
	WebElement blackfriday;
	
	@FindBy(xpath="//a[text()='50% Off or More']")
	WebElement discount;
	
	@FindBy(xpath="(//input[@class='tb-input range-control form-control'])[1]")
	WebElement priceminimum;
	
	@FindBy(xpath="(//input[@class='tb-input range-control form-control'])[2]")
	WebElement pricemaximum;
	
	@FindBy(xpath="//button[@class='c-button-link range-submit']")
	WebElement price_submit;
	
	@FindBy(xpath="//a[text()='4 & Up']")
	WebElement rating;
	
	@FindBy(xpath="//button[@class='c-button-link clear-all']")
	WebElement clear;
	
	
	@FindBy(xpath="//a[text()='Sony - WF-C700N Truly Wireless Noise Canceling In-Ear Headphones - Black']")
	WebElement selectanitem3;
	
	@FindBy(xpath="//a[text()='Sony - LinkBuds S True Wireless Noise Canceling Earbuds - Black']")
	WebElement selectanitem4;

	@FindBy(xpath="//button[@class='c-close-icon c-modal-close-icon']")
	WebElement close;
	
	@FindBy(xpath="//button[@class='c-button-link card-call-to-action-button']")
	WebElement switch_shipping;
	
	@FindBy(xpath="//span[text()='Cart']")
	WebElement  cart;
	
	
	   //Constructor Initialization 
       public AddAnItem(WebDriver driver) {
		
		    this.driver=driver;
		    PageFactory.initElements(driver, this);
		
		}
	
    //enter an item name  in search bar
    public AddAnItem searchAnItem( String item) {
	
		sendKeys(search, item);
	    return this;
	
        }

    //click search button in search bar 
    public AddAnItem clickSearch() {
	
		click(searchbutton);
	    return this;
	
               }

    // move to the desired item and click   
    public AddAnItem selectAnItem() {
	
	   moveToElement(selectitem);
	   actionClick(selectitem);
	   return this;
	
        }

    // click addtocart button 
    public AddAnItem addToCart() {
	
	   // moveToElement(addtocart);
	    click(addtocart);
	    return this;
	
        }
    
    // to verify whether the message is displayed after added item  to the cart
    public AddAnItem verifyItemAdded(String excepted) {
	
	   // waitForVisible(itemaddedtocart);
	    validateText(itemaddedtocart,excepted);
	    return this;
         }

    //click continue shopping link 
    public AddAnItem clickContinue() throws InterruptedException {
	    sleep();
	    click(continueshopping);
	    return this;
         }

     // click menu button 
    public AddAnItem clickMenu() throws InterruptedException {
	    sleep();	    
	    click(menu);
	    return this;
         }

    // click Departments link 
    public AddAnItem clickByDepartment() {
	
	    click(computers);
	    return this;
          }

    //click desired department
    public AddAnItem clickTab() {
	
	    click(tablet);
	    return this;
          }

    // click desired product under department 
    public AddAnItem clickGalaxyTab() {
	
	    click(galaxytab);
	    return this;
          }
    //click desired product under department 
    public AddAnItem clickGalaxyTabUltra() throws InterruptedException {
	     sleep();
	    click(galaxyultra);
	    return this;
          }
    //move to the desired item link and click  
    public AddAnItem selectTab() {
	
	    click(selectanitem1);
	    return this;
	
          }

    // click addtocart button 
    public AddAnItem addTabToTheCart() {
	
	    moveToElement(addtocart);
	    click(addtocart);
	    return this;
	
           }

    //click Brand link 
    public AddAnItem clickByBrand() {
	
	    click(brands);
	    return this;
           }

    //click a brand name 
    public AddAnItem clickBrandName() {
	
	    click(sony);
	    return this;
           }

    //click the desired product under the brand
    public AddAnItem clickHeadPhone() {
	
	    moveToElement(headphone);
	    click(headphone);
	    return this;
           }

    //move to the desired item link and click  
    public AddAnItem selectItem2() {
	
	    moveToElement(selectanitem2);
	    click(selectanitem2);
	    return this;
           }

    //click addtocart button 
    public AddAnItem addItem3ToCart() {
	
	    moveToElement(addtocart);
	    click(addtocart);
	    return this;
	
            }

     //click go to cart button 
    public AddAnItem clickGoToCart() throws InterruptedException {
	
	     sleep();
	     waitForVisible(gotocart);
	     click(gotocart);
	     return this;
           }

    //click checkout button 
    public AddAnItem clickCheckOut() {
	     click(checkout);
	     return this;
	
           }

    //click continue as guest button 
    public AddAnItem clickContinueAsGuest() {
	    click(continueasguest);
	    return this;
	
           }

    //to enter email id in the email field 
    public AddAnItem enterEmail(String mail) {
	    moveToElement(email);
	    sendKeys(email,mail);
	    return this;
	
           }
    
    //enter phone number in mobile number field 
   public AddAnItem enterPhoneNo(String phno) {
	
	    sendKeys(phoneno,phno);
	    return this;
	
           }

    //click continue payment button 
    public AddAnItem clickContinuePayment() {
	
	    click(continuepayment);
	    return this;
           }

    //enter card number 
    public AddAnItem enterCardNo(String number) {
	
	    sendKeys(card,number);
	    return this;
           }

    //enter first name
    public AddAnItem enterFirstName(String fname) {
    
	    moveToElement(firstname);	
	    sendKeys(firstname,fname);
	    return this;
           }

    //enter last name 
    public AddAnItem enterLastName(String lname) {
	
	    sendKeys(lastname,lname);
	    return this;
           }

    //enter address
    public AddAnItem enterAddress(String add) {
	
	    sendKeys(address,add);
	    return this;
           }

     //enter city 
    public AddAnItem enterCity(String c) {
	
	    sendKeys(city,c);
	    return this;
           }
    //select state
    public AddAnItem selectState(String s) {
	
	    select(state,s);
	    return this;
           }
    //enter zip code
    public AddAnItem enterzipCode(String code) {
	
	    sendKeys(zip,code);
	    return this;
           }

    //click Place order button 
    public AddAnItem clickPlaceAnOrder() {
	
		click(placeorder);	
	    moveToElement(card);
	    return this;
           }
    //click switch to all the shipping 
    public AddAnItem clickSwitch() {
	
	    click(switch_ship);
	    return this;
           }

    //click apply button 
    public AddAnItem clickApply() {
	
	    click(apply);
	    return this;
           }

    //enter address
    public AddAnItem clickEnterAddress() {
	
	    click(enteraddress);
	    return this;
           }

    //click remove button 
    public AddAnItem removeAnItem() {
	
	    click(remove);
	    return this;
           }

    //verify error message 
    public AddAnItem verifyCartIsEmpty(String excepted) {
	
	    waitForVisible(cartisempty);
	    validateText(cartisempty,excepted);
	    return this;
           }

    //verify total balance
    public AddAnItem verifyTotal(String excepted) {
	
	    waitForVisible(total);
	    validateText(total,excepted);
	    return this;
           }

    //click save button 
    public AddAnItem clickSave() {
	
	    scrollUntillElement(selectanitem2);
	    actionClick(savebutton);
	    return this;
           }

    //verify message for saved an item
    public AddAnItem verifySavedItem(String excepted) {
	
	    waitForVisible(saved_msg);
	    validateText(saved_msg,excepted);
	    return this;
           }

    //click my saved link 
    public AddAnItem clickMySaved(String excepted) {
	
		click(mysaveditem);
	    validateTitle(excepted);
	    return this;
           }
    //filter by clicking black friday link 
    public AddAnItem clickDeal() {
    	
	    moveToElement(blackfriday);
	    click(blackfriday);
	    return this;
           }
    //filter by clicking discount button 
    public AddAnItem clickDiscount() {
	    moveToElement(discount);
	    click(discount);
	    return this;
           }

    //filter by clicking rating star 
    public AddAnItem clickRating() {
	    moveToElement(rating);
	    click(rating);
	    return this;
           }

    // clear out the filter
    public AddAnItem clickClear() {
    	
	    click(clear);
	    return this;
           }

    //enter minimum price 
    public AddAnItem enterPriceMinimum(String min) {
	
	    moveToElement(priceminimum);
	    sendKeys(priceminimum,min);
	    return this;
           }
    //enter maximum price 
    public AddAnItem enterPriceMaximum(String max) {
	
		sendKeys(pricemaximum,max);
	    return this;
           }
    //filter the price 
    public AddAnItem clickPrice() {
    	
	    click(price_submit);
	    return this;
           }

    //click the desired selectitem link 
    public AddAnItem selectAnItem3() {
    	
	    moveToElement(selectanitem3);
	    click(selectanitem3);
	    return this;
            }
    //click the desired selectitem link 
    public AddAnItem selectAnItem4() {
    	
	    moveToElement(selectanitem4);
	    click(selectanitem4);
	    return this;
            }

    //close the popup 
    public AddAnItem clickClose() throws InterruptedException {
    	
    try {
	   waitForVisible(close);
	   click(close);
	}
	catch(Exception e ) {
		System.out.println("No such pop up displayed");
	}
	return this;
	
           }

    //click switch to shipping link 
    public AddAnItem moveToSwitch() {
	    moveToElement(switch_shipping);	
	    return this;
           }

    //click cart icon 
    public AddAnItem clickCart() {
	     click(cart);
	     return this;
           }
	
}
