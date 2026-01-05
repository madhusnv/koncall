package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import p001o.a94;
import p001o.cri;
import p001o.h8g;
import p001o.id5;
import p001o.sq8;

/* renamed from: com.facebook.d */
/* loaded from: classes5.dex */
public class AsyncTaskC10774d extends AsyncTask {

    /* renamed from: d */
    public static final a f11420d = new a(null);

    /* renamed from: e */
    public static final String f11421e = AsyncTaskC10774d.class.getCanonicalName();

    /* renamed from: a */
    public final HttpURLConnection f11422a;

    /* renamed from: b */
    public final C10775e f11423b;

    /* renamed from: c */
    public Exception f11424c;

    /* renamed from: com.facebook.d$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }
    }

    public AsyncTaskC10774d(HttpURLConnection httpURLConnection, C10775e c10775e) {
        sq8.m48649h(c10775e, "requests");
        this.f11422a = httpURLConnection;
        this.f11423b = c10775e;
    }

    /* renamed from: a */
    public List m13037a(Void... voidArr) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            sq8.m48649h(voidArr, OutcomeEventsTable.COLUMN_NAME_PARAMS);
            try {
                HttpURLConnection httpURLConnection = this.f11422a;
                return httpURLConnection == null ? this.f11423b.m13049j() : GraphRequest.f11338n.m12904o(httpURLConnection, this.f11423b);
            } catch (Exception e) {
                this.f11424c = e;
                return null;
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: b */
    public void m13038b(List list) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(list, "result");
            super.onPostExecute(list);
            Exception exc = this.f11424c;
            if (exc != null) {
                String str = f11421e;
                h8g h8gVar = h8g.f26398a;
                String str2 = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                sq8.m48648g(str2, "format(format, *args)");
                cri.k0(str, str2);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            return m13037a((Void[]) objArr);
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            m13038b((List) obj);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            super.onPreExecute();
            if (C10773c.m12991E()) {
                String str = f11421e;
                h8g h8gVar = h8g.f26398a;
                String str2 = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                sq8.m48648g(str2, "format(format, *args)");
                cri.k0(str, str2);
            }
            if (this.f11423b.m13055q() == null) {
                this.f11423b.m13044I(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    public String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.f11422a + ", requests: " + this.f11423b + "}";
        sq8.m48648g(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC10774d(C10775e c10775e) {
        this(null, c10775e);
        sq8.m48649h(c10775e, "requests");
    }
}
