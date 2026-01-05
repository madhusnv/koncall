package l7;

import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import og.cg;
import og.d2;
import og.dg;
import og.fg;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l7.d */
/* loaded from: classes.dex */
public final class C4404d extends k0 {

    /* renamed from: r */
    public final /* synthetic */ int f22015r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4404d(boolean z6, int i10) {
        super(z6);
        this.f22015r = i10;
    }

    @Override // l7.k0
    /* renamed from: a */
    public final Object mo9203a(String key, Bundle bundle) {
        switch (this.f22015r) {
            case 0:
                AbstractC4154l.m8923f(bundle, "bundle");
                AbstractC4154l.m8923f(key, "key");
                if (!bundle.containsKey(key) || cg.m10590e(key, bundle)) {
                    return null;
                }
                boolean z6 = bundle.getBoolean(key, false);
                if (z6 || !bundle.getBoolean(key, true)) {
                    return Boolean.valueOf(z6);
                }
                dg.m10615b(key);
                throw null;
            case 1:
                AbstractC4154l.m8923f(bundle, "bundle");
                AbstractC4154l.m8923f(key, "key");
                float f6 = bundle.getFloat(key, Float.MIN_VALUE);
                if (f6 != Float.MIN_VALUE || bundle.getFloat(key, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f6);
                }
                dg.m10615b(key);
                throw null;
            case 2:
                AbstractC4154l.m8923f(bundle, "bundle");
                AbstractC4154l.m8923f(key, "key");
                return Integer.valueOf(cg.m10587b(key, bundle));
            case 3:
                AbstractC4154l.m8923f(bundle, "bundle");
                AbstractC4154l.m8923f(key, "key");
                long j6 = bundle.getLong(key, Long.MIN_VALUE);
                if (j6 != Long.MIN_VALUE || bundle.getLong(key, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j6);
                }
                dg.m10615b(key);
                throw null;
            case 4:
                AbstractC4154l.m8923f(bundle, "bundle");
                AbstractC4154l.m8923f(key, "key");
                return Integer.valueOf(cg.m10587b(key, bundle));
            default:
                AbstractC4154l.m8923f(bundle, "bundle");
                AbstractC4154l.m8923f(key, "key");
                if (!bundle.containsKey(key) || cg.m10590e(key, bundle)) {
                    return null;
                }
                String string = bundle.getString(key);
                if (string != null) {
                    return string;
                }
                dg.m10615b(key);
                throw null;
        }
    }

    @Override // l7.k0
    /* renamed from: b */
    public final String mo9204b() {
        switch (this.f22015r) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            case 4:
                return "reference";
            default:
                return "string";
        }
    }

    @Override // l7.k0
    /* renamed from: d */
    public final Object mo9206d(String value) throws NumberFormatException {
        boolean z6;
        int i10;
        String strSubstring;
        long j6;
        int i11;
        switch (this.f22015r) {
            case 0:
                AbstractC4154l.m8923f(value, "value");
                if (value.equals("true")) {
                    z6 = true;
                } else {
                    if (!value.equals("false")) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 1:
                AbstractC4154l.m8923f(value, "value");
                return Float.valueOf(Float.parseFloat(value));
            case 2:
                AbstractC4154l.m8923f(value, "value");
                if (AbstractC5185w.m10138t(value, "0x", false)) {
                    String strSubstring2 = value.substring(2);
                    AbstractC4154l.m8922e(strSubstring2, "substring(...)");
                    d2.m10599b(16);
                    i10 = Integer.parseInt(strSubstring2, 16);
                } else {
                    i10 = Integer.parseInt(value);
                }
                return Integer.valueOf(i10);
            case 3:
                AbstractC4154l.m8923f(value, "value");
                if (AbstractC5185w.m10129k(value, "L", false)) {
                    strSubstring = value.substring(0, value.length() - 1);
                    AbstractC4154l.m8922e(strSubstring, "substring(...)");
                } else {
                    strSubstring = value;
                }
                if (AbstractC5185w.m10138t(value, "0x", false)) {
                    String strSubstring3 = strSubstring.substring(2);
                    AbstractC4154l.m8922e(strSubstring3, "substring(...)");
                    d2.m10599b(16);
                    j6 = Long.parseLong(strSubstring3, 16);
                } else {
                    j6 = Long.parseLong(strSubstring);
                }
                return Long.valueOf(j6);
            case 4:
                AbstractC4154l.m8923f(value, "value");
                if (AbstractC5185w.m10138t(value, "0x", false)) {
                    String strSubstring4 = value.substring(2);
                    AbstractC4154l.m8922e(strSubstring4, "substring(...)");
                    d2.m10599b(16);
                    i11 = Integer.parseInt(strSubstring4, 16);
                } else {
                    i11 = Integer.parseInt(value);
                }
                return Integer.valueOf(i11);
            default:
                AbstractC4154l.m8923f(value, "value");
                if (value.equals("null")) {
                    return null;
                }
                return value;
        }
    }

    @Override // l7.k0
    /* renamed from: e */
    public final void mo9207e(Bundle bundle, String key, Object obj) {
        switch (this.f22015r) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                AbstractC4154l.m8923f(key, "key");
                bundle.putBoolean(key, zBooleanValue);
                break;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                AbstractC4154l.m8923f(key, "key");
                bundle.putFloat(key, fFloatValue);
                break;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                AbstractC4154l.m8923f(key, "key");
                bundle.putInt(key, iIntValue);
                break;
            case 3:
                long jLongValue = ((Number) obj).longValue();
                AbstractC4154l.m8923f(key, "key");
                bundle.putLong(key, jLongValue);
                break;
            case 4:
                int iIntValue2 = ((Number) obj).intValue();
                AbstractC4154l.m8923f(key, "key");
                bundle.putInt(key, iIntValue2);
                break;
            default:
                String str = (String) obj;
                AbstractC4154l.m8923f(key, "key");
                if (str == null) {
                    fg.m10656b(key, bundle);
                    break;
                } else {
                    fg.m10659e(key, str, bundle);
                    break;
                }
        }
    }

    @Override // l7.k0
    /* renamed from: f */
    public String mo9209f(Object obj) {
        switch (this.f22015r) {
            case 5:
                String s5 = (String) obj;
                if (s5 == null) {
                    return "null";
                }
                AbstractC4154l.m8923f(s5, "s");
                String strEncode = Uri.encode(s5, null);
                AbstractC4154l.m8922e(strEncode, "encode(...)");
                return strEncode;
            default:
                return super.mo9209f(obj);
        }
    }
}
