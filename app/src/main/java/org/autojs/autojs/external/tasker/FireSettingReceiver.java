package org.autojs.autojs.external.tasker;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.NonNull;

import com.twofortyfouram.locale.sdk.client.receiver.AbstractPluginSettingReceiver;

import org.autojs.autojs.external.ScriptIntents;
import org.json.JSONObject;

/**
 * Created by Stardust on Mar 27, 2017.
 */
public class FireSettingReceiver extends AbstractPluginSettingReceiver {

    private static final String TAG = "FireSettingReceiver";

    @Override
    protected boolean isJsonValid(@NonNull JSONObject jsonObject) {
        return ScriptIntents.isTaskerJsonObjectValid(jsonObject);
    }

    @Override
    protected boolean isAsync() {
        return true;
    }

    @Override
    protected void firePluginSetting(@NonNull Context context, @NonNull JSONObject jsonObject) {
        Log.d(TAG, "firePluginSetting: " + jsonObject);
        Intent intent = new Intent().putExtra(ScriptIntents.EXTRA_KEY_JSON, jsonObject.toString());
        ScriptIntents.handleIntent(context.getApplicationContext(), intent);
    }

}
