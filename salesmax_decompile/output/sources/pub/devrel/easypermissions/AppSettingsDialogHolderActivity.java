package pub.devrel.easypermissions;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.DialogInterfaceC1782a;

/* loaded from: classes6.dex */
public class AppSettingsDialogHolderActivity extends AppCompatActivity implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public DialogInterfaceC1782a f57974a;

    /* renamed from: b */
    public int f57975b;

    public static Intent L0(Context context, AppSettingsDialog appSettingsDialog) {
        Intent intent = new Intent(context, (Class<?>) AppSettingsDialogHolderActivity.class);
        intent.putExtra("extra_app_settings", appSettingsDialog);
        return intent;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2, intent);
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", getPackageName(), null));
            data.addFlags(this.f57975b);
            startActivityForResult(data, 7534);
        } else if (i == -2) {
            setResult(0);
            finish();
        } else {
            throw new IllegalStateException("Unknown button type: " + i);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppSettingsDialog appSettingsDialogM60193a = AppSettingsDialog.m60193a(getIntent(), this);
        this.f57975b = appSettingsDialogM60193a.m60194b();
        this.f57974a = appSettingsDialogM60193a.m60197e(this, this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        DialogInterfaceC1782a dialogInterfaceC1782a = this.f57974a;
        if (dialogInterfaceC1782a == null || !dialogInterfaceC1782a.isShowing()) {
            return;
        }
        this.f57974a.dismiss();
    }
}
