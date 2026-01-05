package p001o;

import android.text.InputFilter;
import android.text.Spanned;

/* loaded from: classes3.dex */
public class yza implements InputFilter {

    /* renamed from: a */
    public int f56321a;

    public yza(int i) {
        this.f56321a = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.f56321a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
