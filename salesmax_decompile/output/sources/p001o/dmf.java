package p001o;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.CharConversionException;
import java.io.FileNotFoundException;

/* loaded from: classes4.dex */
public final class dmf implements be9 {

    /* renamed from: a */
    public final SharedPreferences f20282a;

    /* renamed from: b */
    public final String f20283b;

    public dmf(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f20283b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f20282a = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        } else {
            this.f20282a = applicationContext.getSharedPreferences(str2, 0);
        }
    }

    @Override // p001o.be9
    /* renamed from: a */
    public s76 mo18790a() {
        return s76.m47938K(m23569b(), pp6.m44004b());
    }

    /* renamed from: b */
    public final byte[] m23569b() throws CharConversionException, FileNotFoundException {
        try {
            String string = this.f20282a.getString(this.f20283b, null);
            if (string != null) {
                return fy7.m27756a(string);
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", this.f20283b));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", this.f20283b));
        }
    }

    @Override // p001o.be9
    public xd9 read() {
        return xd9.m56049P(m23569b(), pp6.m44004b());
    }
}
