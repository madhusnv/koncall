package j8;

import ai.InterfaceC0144a;
import ai.InterfaceC0147d;
import android.content.SharedPreferences;
import android.util.ArraySet;
import com.sun.mail.util.AbstractC1452a;
import ii.AbstractC3264f;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j8.f */
/* loaded from: classes.dex */
public final class SharedPreferencesC3604f implements SharedPreferences {

    /* renamed from: a */
    public final SharedPreferences f19229a;

    /* renamed from: b */
    public final ArrayList f19230b = new ArrayList();

    /* renamed from: c */
    public final String f19231c;

    /* renamed from: d */
    public final InterfaceC0144a f19232d;

    /* renamed from: e */
    public final InterfaceC0147d f19233e;

    public SharedPreferencesC3604f(String str, SharedPreferences sharedPreferences, InterfaceC0144a interfaceC0144a, InterfaceC0147d interfaceC0147d) {
        this.f19231c = str;
        this.f19229a = sharedPreferences;
        this.f19232d = interfaceC0144a;
        this.f19233e = interfaceC0147d;
    }

    /* renamed from: c */
    public static boolean m8164c(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    /* renamed from: a */
    public final String m8165a(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(AbstractC3264f.m7610b(this.f19233e.mo310a(str.getBytes(StandardCharsets.UTF_8), this.f19231c.getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not encrypt key. " + e10.getMessage(), e10);
        }
    }

    /* renamed from: b */
    public final Object m8166b(String str) {
        if (m8164c(str)) {
            throw new SecurityException(AbstractC1452a.m4561h(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strM8165a = m8165a(str);
            String string = this.f19229a.getString(strM8165a, null);
            if (string != null) {
                byte[] bArrM7609a = AbstractC3264f.m7609a(string);
                InterfaceC0144a interfaceC0144a = this.f19232d;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(interfaceC0144a.mo309b(bArrM7609a, strM8165a.getBytes(charset)));
                byteBufferWrap.position(0);
                switch (AbstractC3599a.f19224a[EnumC3601c.fromId(byteBufferWrap.getInt()).ordinal()]) {
                    case 1:
                        int i10 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                        byteBufferWrap.limit(i10);
                        String string2 = charset.decode(byteBufferSlice).toString();
                        if (!string2.equals("__NULL__")) {
                            return string2;
                        }
                        break;
                    case 2:
                        return Integer.valueOf(byteBufferWrap.getInt());
                    case 3:
                        return Long.valueOf(byteBufferWrap.getLong());
                    case 4:
                        return Float.valueOf(byteBufferWrap.getFloat());
                    case 5:
                        return Boolean.valueOf(byteBufferWrap.get() != 0);
                    case 6:
                        ArraySet arraySet = new ArraySet();
                        while (byteBufferWrap.hasRemaining()) {
                            int i11 = byteBufferWrap.getInt();
                            ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                            byteBufferSlice2.limit(i11);
                            byteBufferWrap.position(byteBufferWrap.position() + i11);
                            arraySet.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                        }
                        if (arraySet.size() != 1 || !"__NULL__".equals(arraySet.valueAt(0))) {
                            return arraySet;
                        }
                        break;
                        break;
                }
            }
            return null;
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not decrypt value. " + e2.getMessage(), e2);
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (m8164c(str)) {
            throw new SecurityException(AbstractC1452a.m4561h(str, " is a reserved key for the encryption keyset."));
        }
        return this.f19229a.contains(m8165a(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC3600b(this, this.f19229a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f19229a.getAll().entrySet()) {
            if (!m8164c(entry.getKey())) {
                try {
                    String str = new String(this.f19233e.mo311b(AbstractC3264f.m7609a(entry.getKey()), this.f19231c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    map.put(str, m8166b(str));
                } catch (GeneralSecurityException e2) {
                    throw new SecurityException("Could not decrypt key. " + e2.getMessage(), e2);
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z6) {
        Object objM8166b = m8166b(str);
        return (objM8166b == null || !(objM8166b instanceof Boolean)) ? z6 : ((Boolean) objM8166b).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f6) {
        Object objM8166b = m8166b(str);
        return (objM8166b == null || !(objM8166b instanceof Float)) ? f6 : ((Float) objM8166b).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i10) {
        Object objM8166b = m8166b(str);
        return (objM8166b == null || !(objM8166b instanceof Integer)) ? i10 : ((Integer) objM8166b).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j6) {
        Object objM8166b = m8166b(str);
        return (objM8166b == null || !(objM8166b instanceof Long)) ? j6 : ((Long) objM8166b).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objM8166b = m8166b(str);
        return (objM8166b == null || !(objM8166b instanceof String)) ? str2 : (String) objM8166b;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objM8166b = m8166b(str);
        Set arraySet = objM8166b instanceof Set ? (Set) objM8166b : new ArraySet();
        return arraySet.size() > 0 ? arraySet : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f19230b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f19230b.remove(onSharedPreferenceChangeListener);
    }
}
