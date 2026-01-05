package oj;

import an.z1;
import android.util.Base64OutputStream;
import com.sun.mail.imap.IMAPStore;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import mq.C4833a;
import og.cf;
import org.json.JSONArray;
import org.json.JSONObject;
import zj.C8985b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: oj.b */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC5390b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f27071a;

    /* renamed from: b */
    public final /* synthetic */ C5391c f27072b;

    public /* synthetic */ CallableC5390b(C5391c c5391c, int i10) {
        this.f27071a = i10;
        this.f27072b = c5391c;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        int i10 = this.f27071a;
        C5391c c5391c = this.f27072b;
        switch (i10) {
            case 0:
                synchronized (c5391c) {
                    try {
                        C5396h c5396h = (C5396h) c5391c.f27073a.get();
                        ArrayList arrayListM11114a = c5396h.m11114a();
                        synchronized (c5396h) {
                            c5396h.f27085a.m6594a(new C4833a(6, c5396h));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i11 = 0; i11 < arrayListM11114a.size(); i11++) {
                            C5389a c5389a = (C5389a) arrayListM11114a.get(i11);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", c5389a.f27069a);
                            jSONObject.put("dates", new JSONArray((Collection) c5389a.f27070b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put(IMAPStore.ID_VERSION, "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return string;
            default:
                synchronized (c5391c) {
                    C5396h c5396h2 = (C5396h) c5391c.f27073a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strM16458a = ((C8985b) c5391c.f27075c.get()).m16458a();
                    synchronized (c5396h2) {
                        c5396h2.f27085a.m6594a(new z1((Object) c5396h2, c5396h2.m11115b(jCurrentTimeMillis), (Object) strM16458a, (Object) cf.m10585f(strM16458a), 4));
                    }
                }
                return null;
        }
    }
}
