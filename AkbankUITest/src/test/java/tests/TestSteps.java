package tests;

import com.thoughtworks.gauge.Step;
import pageModels.TestDetailsModel;

public class TestSteps {
    TestDetailsModel testDetailsModel;

    public TestSteps() {
        testDetailsModel = new TestDetailsModel();
    }

    @Step("Enter Akbank Home Page <key>")
    public void clickCalculationDetails(String key){
        testDetailsModel.goToUrl(key);
    }

    @Step("Scroll down to the bottom of the page")
    public void scrollDownBottomOfPage(){
        testDetailsModel.scrollDownBottomOfPage();
    }

    @Step("Choose SİGORTASIZ")
    public void selectInsuranceType(){
        testDetailsModel.selectInsuranceType();
    }

    @Step("Set vade as 20AY")
    public void setMonth(){
        testDetailsModel.setMonth();
    }

    @Step("Click on Kredi Hesaplama")
    public void clickTextCalculateCredit(){
        testDetailsModel.clickTextCalculateCredit();
    }

    @Step("Enter <key> tl in Tutar field")
    public void setAmount(String key){
        testDetailsModel.setAmount(key);
    }

    @Step("Click Ödeme Planı")
    public void clickButtonPaymentPlan(){
        testDetailsModel.clickButtonPaymentPlan();
    }

    @Step("Click Hesaplama Detayları")
    public void clickButtonDetail(){
        testDetailsModel.clickButtonDetail();
    }

    @Step("Check Masraf ve Maliyet Oranları is opened")
    public void checkListedCost(){
        testDetailsModel.checkListedCost();
    }

    @Step("Check Ödeme Planı is opened")
    public void checkListedPaymentPlan(){
        testDetailsModel.checkListedPaymentPlan();
    }

    @Step("Scroll down on the Ödeme Planı page until 20th is seen")
    public void scrollDownForPaymentPlan(){
        testDetailsModel.scrollDownForPaymentPlan();
    }
}
