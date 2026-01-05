package p001o;

import android.graphics.Path;
import java.util.List;

/* loaded from: classes3.dex */
public class ilf extends gc1 {

    /* renamed from: i */
    public final clf f28826i;

    /* renamed from: j */
    public final Path f28827j;

    public ilf(List list) {
        super(list);
        this.f28826i = new clf();
        this.f28827j = new Path();
    }

    @Override // p001o.gc1
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Path mo20015i(sd9 sd9Var, float f) {
        this.f28826i.m21384c((clf) sd9Var.f45243b, (clf) sd9Var.f45244c, f);
        zeb.m59354i(this.f28826i, this.f28827j);
        return this.f28827j;
    }
}
