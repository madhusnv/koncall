package com.amplifyframework.devmenu;

import a2.AbstractC0030c;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.devmenu.ShakeDetector;
import com.amplifyframework.logging.LogLevel;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.Empty;
import i0.m0;
import java.util.List;
import java.util.Locale;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DeveloperMenu implements ShakeDetector.Listener {
    private static final Logger LOG = Amplify.Logging.logger("amplify:devmenu");
    private static DeveloperMenu sInstance;
    private Context context;
    private HideAction hideAction;
    private PersistentLogStoragePlugin loggingPlugin;
    private boolean visible;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public interface HideAction {
        void hideDeveloperMenu();
    }

    private DeveloperMenu(Context context) {
        this.context = context.getApplicationContext();
    }

    public static DeveloperMenu singletonInstance(Context context) {
        if (sInstance == null) {
            sInstance = new DeveloperMenu(context);
        }
        return sInstance;
    }

    public void copyToClipboard(String str) {
        ((ClipboardManager) this.context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Copied Text", str));
    }

    public String createIssueBody(String str, boolean z6) {
        String developerEnvironmentInfo;
        PersistentLogStoragePlugin persistentLogStoragePlugin;
        EnvironmentInfo environmentInfo = new EnvironmentInfo();
        String strM7379l = "*Amplify Plugins Information:*\n" + environmentInfo.getPluginVersions();
        String str2 = "";
        try {
            developerEnvironmentInfo = environmentInfo.getDeveloperEnvironmentInfo(this.context);
        } catch (AmplifyException unused) {
            LOG.warn("Error reading developer environment information.");
            developerEnvironmentInfo = "";
        }
        if (!developerEnvironmentInfo.isEmpty()) {
            strM7379l = m0.m7379l(strM7379l, "\n\n*Developer Environment Information:*\n", developerEnvironmentInfo);
        }
        String string = new DeviceInfo().toString();
        if (z6 && (persistentLogStoragePlugin = this.loggingPlugin) != null && !persistentLogStoragePlugin.getLogs().isEmpty()) {
            str2 = "**Logs**\n```\n" + getLogs() + "```";
        }
        Locale locale = Locale.US;
        return a1.m14335o(AbstractC0030c.m127r("**Issue Description**\n", str, "\n\n**Environment Information**\n", strM7379l, "\n\n**Device Information**\n"), string, "\n\n", str2);
    }

    public void enableDeveloperMenu() {
        if ((this.context.getApplicationInfo().flags & 2) != 0) {
            PersistentLogStoragePlugin persistentLogStoragePlugin = new PersistentLogStoragePlugin();
            this.loggingPlugin = persistentLogStoragePlugin;
            Amplify.addPlugin(persistentLogStoragePlugin);
            startListening();
        }
    }

    public String getFilteredLogs(String str, LogLevel logLevel) {
        if (this.loggingPlugin == null) {
            return "No logs to display.";
        }
        if (Empty.check(str) && logLevel == null) {
            return getLogs();
        }
        List<LogEntry> logs = this.loggingPlugin.getLogs();
        if (logs.isEmpty()) {
            return "No logs to display.";
        }
        StringBuilder sb2 = new StringBuilder();
        String lowerCase = str == null ? "" : str.toLowerCase(Locale.US);
        for (LogEntry logEntry : logs) {
            String string = logEntry.toString();
            if (string.toLowerCase(Locale.US).contains(lowerCase) && (logLevel == null || logEntry.getLogLevel() == logLevel)) {
                sb2.append(string);
            }
        }
        String string2 = sb2.toString();
        return string2.isEmpty() ? "No logs match the search criteria." : string2;
    }

    public String getLogs() {
        PersistentLogStoragePlugin persistentLogStoragePlugin = this.loggingPlugin;
        if (persistentLogStoragePlugin == null) {
            return "No logs to display.";
        }
        List<LogEntry> logs = persistentLogStoragePlugin.getLogs();
        return logs.isEmpty() ? "No logs to display." : TextUtils.join("", logs);
    }

    @Override // com.amplifyframework.devmenu.ShakeDetector.Listener
    public void onShakeDetected() {
        if (this.visible) {
            HideAction hideAction = this.hideAction;
            if (hideAction != null) {
                hideAction.hideDeveloperMenu();
            }
            this.visible = false;
            return;
        }
        Intent intent = new Intent(this.context, (Class<?>) DeveloperMenuActivity.class);
        intent.setAction("android.intent.action.MAIN");
        intent.setFlags(268435456);
        this.context.startActivity(intent);
        this.visible = true;
    }

    public void setOnHideAction(HideAction hideAction) {
        this.hideAction = hideAction;
    }

    public void setVisible(boolean z6) {
        this.visible = z6;
    }

    public void startListening() {
        new ShakeDetector(this.context, this).startDetecting();
    }
}
