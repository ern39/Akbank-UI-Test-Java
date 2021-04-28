package pageModels;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestDetailsModel extends BaseModel {

    @FindBy(id="ctl00_ucFooterMenu_rptMain_ctl02_rptChild_ctl00_linkChild")
    public WebElement txtCalculateCredit;

    @FindBy(id="t-credit-price")
    public WebElement txtAmount;

    @FindBy(xpath="//label[@for='insuredType2']")
    public WebElement rbInsurance;

    @FindBy(xpath="//div[@class='tabs-content oran active'][@id='content-1']")
    public WebElement txtCostRates;

    @FindBy(xpath="//div[@class='tabs-content plan active jspScrollable'][@id='content-2']")
    public WebElement txtListedPaymentPlanMonth;

    @FindBy(className="open-tooltip")
    public WebElement txtCalculateDetails;

    @FindBy(id="accordion2")
    public WebElement txtPaymentPlan;

    @FindBy(xpath="//*[@id='ctl00_ctl43_g_26e16d7b_ef03_46b5_a437_2bc263507602']/div[1]/div/div[2]/div[1]/div/div[1]/div/div[2]/div[3]/a[2]")
    public WebElement btnDecrease;

    @FindBy(xpath="//div[@class='tabs-content plan active jspScrollable'][@id='content-2']")
    public WebElement txtListedPaymentPlan;

    @FindBy(className="jspDrag")
    public WebElement jspDrag;

    public void goToUrl(String key){
        webDriver.get(key);
    }

    public void selectInsuranceType() {
        clickElement(rbInsurance);
    }

    public void clickTextCalculateCredit() {
        clickElement(txtCalculateCredit);
    }

    public void scrollDownBottomOfPage() {
        scrollInToView(txtCalculateCredit);
    }

    public void clickButtonDetail() {
        clickElement(txtCalculateDetails);
    }

    public void setAmount(String amount) {
        clickElement(txtAmount);
        clear(txtAmount);
        setText(txtAmount, amount);
    }

    public void clickButtonPaymentPlan() {
        clickElement(txtPaymentPlan);
    }

    public void checkListedPaymentPlan(){
        if (!txtListedPaymentPlan.isDisplayed()) {
            Assert.fail("Listed Payment Detail cannot be loaded!");
        }
    }

    public void checkListedCost() {
        if (!txtCostRates.isDisplayed()) {
            Assert.fail("Cost Rates cannot be loaded!");
        }
    }

    public void setMonth() {
        for (int i = 0; i < 8; i++) {
            clickElement(btnDecrease);
        }
    }

    public void scrollDownForPaymentPlan() {
        scrollInToView(txtListedPaymentPlanMonth);
        actions.dragAndDropBy(jspDrag,0,300).build().perform();
    }
}
