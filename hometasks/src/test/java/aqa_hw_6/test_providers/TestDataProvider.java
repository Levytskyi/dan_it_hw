package aqa_hw_6.test_providers;

public class TestDataProvider {
    @org.testng.annotations.DataProvider
    public Object[][] getSearchData() {
        return new Object[][]{
                {"Sony Playstation", "sony-playstation"},
                {"Microsoft Xbox", "microsoft-xbox"},
                {"Nintendo Switch", "nintendo-switch"}
        };
    }
}
