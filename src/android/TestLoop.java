package cordova-plugin-testloop;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class TestLoop extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("startLoop")) {
            String message = args.getString(0);
            this.startLoop(message, callbackContext);
            return true;
        } else if (action.equals("clearLoop")) {
            String message = args.getString(0);
            this.clearLoop(message, callbackContext);
            return true;
        }
        return false;
    }

    private void startLoop(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message + "probando native");
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    private void clearLoop(String message, CallbackContext callbackContext) {
        callbackContext.success(message + "clearing native");
    }
}
