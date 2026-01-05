package p001o;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* loaded from: classes3.dex */
public class we9 extends Paint {
    public we9() {
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public we9(int i) {
        super(i);
    }

    public we9(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public we9(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
