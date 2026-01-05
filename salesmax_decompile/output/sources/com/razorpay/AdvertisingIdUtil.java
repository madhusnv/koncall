package com.razorpay;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.razorpay.AdvertisingIdUtil;

/* loaded from: classes6.dex */
public class AdvertisingIdUtil {

    interface AdvertisingIdCallback {
        void onResult(String str);
    }

    public static void getId(final Context context, final AdvertisingIdCallback advertisingIdCallback) {
        new AsyncTask<Void, Void, String>(context, advertisingIdCallback) { // from class: com.razorpay.a_$P$

            /* renamed from: a */
            private AdvertisingIdUtil.AdvertisingIdCallback f13723a;

            /* renamed from: b */
            @SuppressLint({"StaticFieldLeak"})
            private Context f13724b;

            {
                this.f13724b = context;
                this.f13723a = advertisingIdCallback;
            }

            /* JADX WARN: Type inference failed for: r3v6, types: [com.razorpay.R$$r_] */
            /* renamed from: a */
            private String m16050a() {
                G__G_ g__g_ = new G__G_((byte) 0);
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (!this.f13724b.bindService(intent, g__g_, 1)) {
                    return "permission disabled";
                }
                try {
                    try {
                        return new IInterface(g__g_.m15987a()) { // from class: com.razorpay.R$$r_

                            /* renamed from: a */
                            private IBinder f13677a;

                            {
                                this.f13677a = iBinder;
                            }

                            /* renamed from: a */
                            public final String m16019a() {
                                Parcel parcelObtain = Parcel.obtain();
                                Parcel parcelObtain2 = Parcel.obtain();
                                try {
                                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                    this.f13677a.transact(1, parcelObtain, parcelObtain2, 0);
                                    parcelObtain2.readException();
                                    return parcelObtain2.readString();
                                } finally {
                                    parcelObtain2.recycle();
                                    parcelObtain.recycle();
                                }
                            }

                            @Override // android.os.IInterface
                            public final IBinder asBinder() {
                                return this.f13677a;
                            }
                        }.m16019a();
                    } catch (Exception e) {
                        String message = e.getMessage();
                        try {
                            this.f13724b.unbindService(g__g_);
                        } catch (IllegalArgumentException e2) {
                            AnalyticsUtil.reportError(a_$P$.class.getName(), "S1", e2.getLocalizedMessage());
                        }
                        return message;
                    }
                } finally {
                    try {
                        this.f13724b.unbindService(g__g_);
                    } catch (IllegalArgumentException e3) {
                        AnalyticsUtil.reportError(a_$P$.class.getName(), "S1", e3.getLocalizedMessage());
                    }
                }
            }

            @Override // android.os.AsyncTask
            public final /* synthetic */ String doInBackground(Void[] voidArr) {
                return m16050a();
            }

            @Override // android.os.AsyncTask
            public final /* synthetic */ void onPostExecute(String str) {
                String str2 = str;
                super.onPostExecute(str2);
                this.f13723a.onResult(str2);
            }
        }.execute(new Void[0]);
    }
}
