package p001o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes2.dex */
public final class gha {

    /* renamed from: f */
    public static final Object f25190f = new Object();

    /* renamed from: g */
    public static gha f25191g;

    /* renamed from: a */
    public final Context f25192a;

    /* renamed from: b */
    public final HashMap f25193b = new HashMap();

    /* renamed from: c */
    public final HashMap f25194c = new HashMap();

    /* renamed from: d */
    public final ArrayList f25195d = new ArrayList();

    /* renamed from: e */
    public final Handler f25196e;

    /* renamed from: o.gha$a */
    public class HandlerC13717a extends Handler {
        public HandlerC13717a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                gha.this.m28701a();
            }
        }
    }

    /* renamed from: o.gha$b */
    public static final class C13718b {

        /* renamed from: a */
        public final Intent f25198a;

        /* renamed from: b */
        public final ArrayList f25199b;

        public C13718b(Intent intent, ArrayList arrayList) {
            this.f25198a = intent;
            this.f25199b = arrayList;
        }
    }

    /* renamed from: o.gha$c */
    public static final class C13719c {

        /* renamed from: a */
        public final IntentFilter f25200a;

        /* renamed from: b */
        public final BroadcastReceiver f25201b;

        /* renamed from: c */
        public boolean f25202c;

        /* renamed from: d */
        public boolean f25203d;

        public C13719c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f25200a = intentFilter;
            this.f25201b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f25201b);
            sb.append(" filter=");
            sb.append(this.f25200a);
            if (this.f25203d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public gha(Context context) {
        this.f25192a = context;
        this.f25196e = new HandlerC13717a(context.getMainLooper());
    }

    /* renamed from: b */
    public static gha m28700b(Context context) {
        gha ghaVar;
        synchronized (f25190f) {
            if (f25191g == null) {
                f25191g = new gha(context.getApplicationContext());
            }
            ghaVar = f25191g;
        }
        return ghaVar;
    }

    /* renamed from: a */
    public void m28701a() {
        int size;
        C13718b[] c13718bArr;
        while (true) {
            synchronized (this.f25193b) {
                size = this.f25195d.size();
                if (size <= 0) {
                    return;
                }
                c13718bArr = new C13718b[size];
                this.f25195d.toArray(c13718bArr);
                this.f25195d.clear();
            }
            for (int i = 0; i < size; i++) {
                C13718b c13718b = c13718bArr[i];
                int size2 = c13718b.f25199b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C13719c c13719c = (C13719c) c13718b.f25199b.get(i2);
                    if (!c13719c.f25203d) {
                        c13719c.f25201b.onReceive(this.f25192a, c13718b.f25198a);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void m28702c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f25193b) {
            C13719c c13719c = new C13719c(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) this.f25193b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f25193b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c13719c);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.f25194c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f25194c.put(action, arrayList2);
                }
                arrayList2.add(c13719c);
            }
        }
    }

    /* renamed from: d */
    public boolean m28703d(Intent intent) {
        int i;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        boolean z;
        synchronized (this.f25193b) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f25192a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z2 = true;
            boolean z3 = (intent.getFlags() & 8) != 0;
            if (z3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Resolving type ");
                sb.append(strResolveTypeIfNeeded);
                sb.append(" scheme ");
                sb.append(scheme);
                sb.append(" of intent ");
                sb.append(intent);
            }
            ArrayList arrayList3 = (ArrayList) this.f25194c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Action list: ");
                    sb2.append(arrayList3);
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    C13719c c13719c = (C13719c) arrayList3.get(i2);
                    if (z3) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Matching against filter ");
                        sb3.append(c13719c.f25200a);
                    }
                    if (c13719c.f25202c) {
                        i = i2;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = strResolveTypeIfNeeded;
                        arrayList = arrayList4;
                        z = z2;
                    } else {
                        IntentFilter intentFilter = c13719c.f25200a;
                        String str3 = action;
                        String str4 = strResolveTypeIfNeeded;
                        i = i2;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = strResolveTypeIfNeeded;
                        z = z2;
                        int iMatch = intentFilter.match(str3, str4, scheme, data, categories, "LocalBroadcastManager");
                        if (iMatch >= 0) {
                            if (z3) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("  Filter matched!  match=0x");
                                sb4.append(Integer.toHexString(iMatch));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(c13719c);
                            c13719c.f25202c = z;
                            i2 = i + 1;
                            z2 = z;
                            action = str;
                            arrayList3 = arrayList2;
                            strResolveTypeIfNeeded = str2;
                        } else if (z3) {
                            String str5 = iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : Constants.ScionAnalytics.MessageType.DATA_MESSAGE : "action" : "category";
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("  Filter did not match: ");
                            sb5.append(str5);
                        }
                    }
                    arrayList4 = arrayList;
                    i2 = i + 1;
                    z2 = z;
                    action = str;
                    arrayList3 = arrayList2;
                    strResolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                boolean z4 = z2;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((C13719c) arrayList5.get(i3)).f25202c = false;
                    }
                    this.f25195d.add(new C13718b(intent, arrayList5));
                    if (!this.f25196e.hasMessages(z4 ? 1 : 0)) {
                        this.f25196e.sendEmptyMessage(z4 ? 1 : 0);
                    }
                    return z4;
                }
            }
            return false;
        }
    }

    /* renamed from: e */
    public void m28704e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f25193b) {
            ArrayList arrayList = (ArrayList) this.f25193b.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C13719c c13719c = (C13719c) arrayList.get(size);
                c13719c.f25203d = true;
                for (int i = 0; i < c13719c.f25200a.countActions(); i++) {
                    String action = c13719c.f25200a.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.f25194c.get(action);
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            C13719c c13719c2 = (C13719c) arrayList2.get(size2);
                            if (c13719c2.f25201b == broadcastReceiver) {
                                c13719c2.f25203d = true;
                                arrayList2.remove(size2);
                            }
                        }
                        if (arrayList2.size() <= 0) {
                            this.f25194c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
