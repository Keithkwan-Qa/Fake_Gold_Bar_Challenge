package Find_The_Fake_Gold_Bar_Test;

import Fetch_Gold_Bar_Objects_And_Methods.Fake_Gold_Bar_Objects_And_Methods;
import org.testng.annotations.Test;

public class Fake_Gold_Bar_Test extends Fake_Gold_Bar_Test_Parent {


    /* I want to always start by inputting 1-4 into the left bowl and input 5-8 into the right bowl to weigh.
    This will automatically identify whether gold bar 0 is a fake bar or not, without need to measure.

    Every time we press weigh, we will capture the result as well as weighing, printing it out in the console.

    The bowl with the gold bars that weigh less will be continously split into sets of two until the fake gold bar is found.

    Once the gold bar is found, the test will end
    **/

    @Test
    public void comparingWeightsOfGoldBars() throws InterruptedException {

        Fake_Gold_Bar_Objects_And_Methods page = new Fake_Gold_Bar_Objects_And_Methods(driver);

        //Enter numbers 1-4 into the left bowl
        page.sendKeysToLeftBowlSlot0("1");
        page.sendKeysToLeftBowlSlot1("2");
        page.sendKeysToLeftBowlSlot2("3");
        page.sendKeysToLeftBowlSlot3("4");
        Thread.sleep(2000);

        //Enter numbers 5-6 into the right bowl
        page.sendKeysToRightBowlSlot0("5");
        page.sendKeysToRightBowlSlot1("6");
        page.sendKeysToRightBowlSlot2("7");
        page.sendKeysToRightBowlSlot3("8");
        Thread.sleep(2000);

        //Click on weigh
        page.clickOnWeigh();
        Thread.sleep(2000);

        //Capture the results and weighing
        System.out.println("Result is " + page.captureResult());
        page.captureWeighing();
        Thread.sleep(2000);

        //If result is "=" that would identify gold bar 0 as the fake gold bar
        if (page.captureResult().equals("=")) {

            //Click on reset
            page.clickOnReset();
            Thread.sleep(2000);

            //Click on gold bar 0
            page.clickOnGoldBar0();
            Thread.sleep(2000);

            //Capture alert message
            page.captureMessage();
            System.out.println("Gold bar 0 was the fake");

            //end method
            return;

            //else if result is "<" we need to input gold bar 1-2 into the left bowl and 3-4 into the right bowl
        } else if (page.captureResult().equals("<")) {

            //Click on reset
            page.clickOnReset();
            Thread.sleep(2000);

            //Enter numbers 1-2 into the left bowl
            page.sendKeysToLeftBowlSlot0("1");
            page.sendKeysToLeftBowlSlot1("2");

            //Enter numbers 3-4 into the right bowl
            page.sendKeysToRightBowlSlot0("3");
            page.sendKeysToRightBowlSlot1("4");

            //Click on weigh
            page.clickOnWeigh();
            Thread.sleep(2000);

            //Capture the results and weighing
            System.out.println("Result is " + page.captureResult());
            page.captureWeighing();
            Thread.sleep(2000);

            //Nested condition 1 stating that if the result is that gold bar 1-2 weighs less than gold bar 3-4, we weigh gold bar 1 against gold bar 2
            if (page.captureResult().equals("<")) {

                //Click on reset
                page.clickOnReset();
                Thread.sleep(2000);

                //Enter number 1 into the left bowl
                page.sendKeysToLeftBowlSlot0("1");

                //Enter number 2 into the right bowl
                page.sendKeysToRightBowlSlot0("2");

                //Click on weigh
                page.clickOnWeigh();
                Thread.sleep(2000);

                //Capture the results and weighing
                System.out.println("Result is " + page.captureResult());
                page.captureWeighing();
                Thread.sleep(2000);

                //Nested condition 2 stating that if the result is that gold bar 2 weighs less than gold bar 1, we choose gold bar 2 as the fake bar.
                if (page.captureResult().equals(">")) {

                    //Click on gold bar 2
                    page.clickOnGoldBar2();
                    Thread.sleep(2000);

                    //Capture alert message
                    page.captureMessage();
                    System.out.println("Gold bar 2 was the fake");

                    //end method
                    return;

                    //Nested condition 2 otherwise, we choose gold bar 1 as the fake gold bar
                } else {

                    //Click on gold bar 1
                    page.clickOnGoldBar1();
                    Thread.sleep(2000);

                    //Capture alert message
                    page.captureMessage();
                    System.out.println("Gold bar 1 was the fake");

                    //end method
                    return;
                } // End of nested condition 2

                //Nested condition 1 stating that else if the result is that gold bar 3-4 weighs less than gold bar 1-2, we weigh gold bar 3 against gold bar 4
            } else if (page.captureResult().equals(">")) {

                //Click on reset
                page.clickOnReset();
                Thread.sleep(2000);

                //Enter number 3 into the left bowl
                page.sendKeysToLeftBowlSlot0("3");

                //Enter number 4 into the right bowl
                page.sendKeysToRightBowlSlot0("4");

                //Click on weigh
                page.clickOnWeigh();
                Thread.sleep(2000);

                //Capture the results and weighing
                System.out.println("Result is " + page.captureResult());
                page.captureWeighing();
                Thread.sleep(2000);

                //Nested condition 3 stating that if the result is that gold bar 4 weighs less than gold bar 3, we choose gold bar 4 as the fake bar.
                if (page.captureResult().equals(">")) {

                    //Click on gold bar 4
                    page.clickOnGoldBar4();
                    Thread.sleep(2000);

                    //Capture alert message
                    page.captureMessage();
                    System.out.println("Gold bar 4 was the fake");

                    //End method
                    return;

                    //Nested condition 3 otherwise, we choose gold bar 3 as the fake gold bar
                } else {

                    //Click on gold bar 3
                    page.clickOnGoldBar3();
                    Thread.sleep(2000);

                    //Capture alert message
                    page.captureMessage();
                    System.out.println("Gold bar 3 was the fake");

                    //End method
                    return;
                } //End of nested condition 3
            }//End of nested condition 1

            //Otherwise, we assume the result is ">" and input gold bar 5-6 into the left bowl and 7-8 into the right bowl
        } else {

            //Click on reset
            page.clickOnReset();

            //Enter numbers 5-6 into the left bowl
            page.sendKeysToLeftBowlSlot0("5");
            page.sendKeysToLeftBowlSlot1("6");

            //Enter numbers 7-8 into the right bowl
            page.sendKeysToRightBowlSlot0("7");
            page.sendKeysToRightBowlSlot1("8");

            //Click on weigh
            page.clickOnWeigh();
            Thread.sleep(2000);

            //Capture the results and weighing
            System.out.println("Result is " + page.captureResult());
            page.captureWeighing();
            Thread.sleep(2000);

        }
        //Nested condition 4 stating that if the result is that gold bar 5-6 weighs less than gold bar 7-8, we weigh gold bar 5 against gold bar 6
        if (page.captureResult().equals("<")) {

            //Click on reset
            page.clickOnReset();
            Thread.sleep(2000);

            //Enter number 5 into the left bowl
            page.sendKeysToLeftBowlSlot0("5");

            //Enter number 6 into the right bowl
            page.sendKeysToRightBowlSlot0("6");

            //Click on weigh
            page.clickOnWeigh();
            Thread.sleep(2000);

            //Capture the results and weighing
            System.out.println("Result is " + page.captureResult());
            page.captureWeighing();
            Thread.sleep(2000);

            //Nested condition 5 stating that if the result is that gold bar 6 weighs less than gold bar 5, we choose gold bar 6 as the fake bar
            if (page.captureResult().equals(">")) {

                //Click on gold bar 6
                page.clickOnGoldBar6();
                Thread.sleep(2000);

                //Capture alert message
                page.captureMessage();
                System.out.println("Gold bar 6 was the fake");

                //End method
                return;

                //Nested condition 5 stating otherwise, we choose gold bar 5 as the fake gold bar
            } else {

                //Click on gold bar 5
                page.clickOnGoldBar5();
                Thread.sleep(2000);

                //Capture alert message
                page.captureMessage();
                System.out.println("Gold bar 5 was the fake");

                //End method
                return;

            } // End of nested condition 5

            //Nested condition 4 stating else if the result is that gold bars 7-8 weigh less than gold bars 5-6, we weigh gold bar 7 against gold bar 8
        } else if (page.captureResult().equals(">")) {

            //Click on reset
            page.clickOnReset();
            Thread.sleep(2000);

            //Enter number 7 into the left bowl
            page.sendKeysToLeftBowlSlot0("7");

            //Enter number 8 into the right bowl
            page.sendKeysToRightBowlSlot0("8");

            //Click on weigh
            page.clickOnWeigh();
            Thread.sleep(2000);

            //Capture results and weighing
            System.out.println("Result is " + page.captureResult());
            page.captureWeighing();
            Thread.sleep(2000);

            //Nested condition 6 stating that if the result is that gold bar 8 weighs less than gold bar 7, we choose gold bar 8 as the fake bar
            if (page.captureResult().equals(">")) {

                //Click on gold bar 8
                page.clickOnGoldBar8();
                Thread.sleep(2000);

                //Capture alert message
                page.captureMessage();
                System.out.println("Gold bar 8 was the fake");

                //End method
                return;

                //Nested condition 6 stating otherwise if the result is that gold bar 7 weighs less than gold bar 8, we choose gold bar 7 as the fake bar
            } else {

                //Click on gold bar 7
                page.clickOnGoldBar7();
                Thread.sleep(2000);

                //Capture alert message
                page.captureMessage();
                System.out.println("Gold bar 7 was the fake");

                //End method
                return;
            }//End of Nested condition 6
        }
    }


}

