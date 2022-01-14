package common;

public class Config {
    /**
     * Platform and browser configuration
     */
    public static final String PLATFORM_AND_BROWSER = "win_chrome";
    /**
     * Clear cookies and storage after each iteration
     * If true then clear
     * default - false
     */
    public static final boolean CLEAR_COOKIES_AND_STORAGE = false;
    /**
     * Keep browser open after each suite
     * if true then keep
     * default - false
     */
    public static final boolean HOLD_BROWSER_OPEN = false;
}
