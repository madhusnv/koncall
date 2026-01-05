package p001o;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes6.dex */
public class lgb extends Exception {

    /* renamed from: a */
    public final int f33759a;

    public lgb(String str, int i) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."));
        this.f33759a = i;
    }

    public lgb(String str, int i, Throwable th) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."), th);
        this.f33759a = i;
    }
}
