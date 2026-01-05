package p001o;

import android.app.PendingIntent;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import p001o.o2c;

/* loaded from: classes2.dex */
public class r2c extends o2c.AbstractC15698j {

    /* renamed from: f */
    public MediaSessionCompat.Token f42779f;

    /* renamed from: g */
    public CharSequence f42780g;

    /* renamed from: h */
    public int f42781h;

    /* renamed from: i */
    public PendingIntent f42782i;

    /* renamed from: e */
    public int[] f42778e = null;

    /* renamed from: j */
    public boolean f42783j = false;

    @Override // p001o.o2c.AbstractC15698j
    /* renamed from: b */
    public void mo41367b(d2c d2cVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            p2c.m42886d(d2cVar.mo22276a(), p2c.m42884b(q2c.m44743a(p2c.m42883a(), this.f42780g, this.f42781h, this.f42782i, Boolean.valueOf(this.f42783j)), this.f42778e, this.f42779f));
        } else {
            p2c.m42886d(d2cVar.mo22276a(), p2c.m42884b(p2c.m42883a(), this.f42778e, this.f42779f));
        }
    }

    @Override // p001o.o2c.AbstractC15698j
    /* renamed from: d */
    public RemoteViews mo41462d(d2c d2cVar) {
        return null;
    }

    @Override // p001o.o2c.AbstractC15698j
    /* renamed from: e */
    public RemoteViews mo41463e(d2c d2cVar) {
        return null;
    }

    /* renamed from: h */
    public r2c m46067h(MediaSessionCompat.Token token) {
        this.f42779f = token;
        return this;
    }

    /* renamed from: i */
    public r2c m46068i(int... iArr) {
        this.f42778e = iArr;
        return this;
    }
}
