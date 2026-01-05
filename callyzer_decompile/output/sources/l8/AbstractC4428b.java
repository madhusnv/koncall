package l8;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import kotlin.jvm.internal.AbstractC4154l;
import m8.C4672b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l8.b */
/* loaded from: classes.dex */
public abstract class AbstractC4428b {

    /* renamed from: a */
    public final int f22147a;

    public AbstractC4428b(int i10) {
        this.f22147a = i10;
    }

    /* renamed from: a */
    public static void m9266a(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i10 = 0;
        boolean z6 = false;
        while (i10 <= length) {
            boolean z10 = AbstractC4154l.m8924g(str.charAt(!z6 ? i10 : length), 32) <= 0;
            if (z6) {
                if (!z10) {
                    break;
                } else {
                    length--;
                }
            } else if (z10) {
                i10++;
            } else {
                z6 = true;
            }
        }
        if (str.subSequence(i10, length + 1).toString().length() == 0) {
            return;
        }
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public abstract void mo9268c(C4672b c4672b);

    /* renamed from: d */
    public abstract void mo9269d(C4672b c4672b, int i10, int i11);

    /* renamed from: e */
    public abstract void mo9270e(C4672b c4672b);

    /* renamed from: f */
    public abstract void mo9271f(C4672b c4672b, int i10, int i11);

    /* renamed from: b */
    public void mo9267b(C4672b c4672b) {
    }
}
