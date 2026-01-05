package android.support.v4.media;

import a2.AbstractC0030c;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.C0220a;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.AbstractC0222a;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.fragment.app.C0337b;
import androidx.fragment.app.C0338c;
import androidx.fragment.app.e1;
import androidx.fragment.app.l1;
import androidx.fragment.app.p1;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.C1275a;
import com.google.android.gms.fido.fido2.api.common.C1276b;
import com.google.android.gms.fido.fido2.api.common.C1277c;
import com.google.android.gms.fido.fido2.api.common.C1278d;
import com.google.android.gms.fido.fido2.api.common.C1279e;
import com.google.android.material.datepicker.C1338b;
import com.google.android.material.datepicker.C1340d;
import com.google.android.material.datepicker.C1353q;
import ee.C2033a;
import g6.C2533h;
import gg.C2587b;
import gg.C2588c;
import gg.C2590e;
import gg.C2591f;
import gg.C2596k;
import gg.C2597l;
import gg.C2599n;
import gg.C2600o;
import gg.C2603r;
import gg.C2608w;
import gg.C2609x;
import gg.C2610y;
import gg.C2611z;
import gg.a0;
import gg.i0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4154l;
import mg.u0;
import org.bouncycastle.iana.AEADAlgorithm;
import p003d.BinderC1542c;
import p003d.C1540a;
import p003d.C1543d;
import p003d.InterfaceC1541b;
import pg.AbstractC5931l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: android.support.v4.media.a */
/* loaded from: classes.dex */
public final class C0220a implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f1647a;

    public /* synthetic */ C0220a(int i10) {
        this.f1647a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Uri mediaUri;
        Bundle bundle;
        int iM11750o = 0;
        boolean zM11747l = false;
        boolean zM11747l2 = false;
        boolean zM11747l3 = false;
        InterfaceC1541b interfaceC1541b = null;
        String strM11741f = null;
        String strM11741f2 = null;
        switch (this.f1647a) {
            case 0:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0220a(0);

                    /* renamed from: a */
                    public final int f1633a;

                    /* renamed from: b */
                    public final MediaDescriptionCompat f1634b;

                    {
                        this.f1633a = parcel.readInt();
                        this.f1634b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f1633a + ", mDescription=" + this.f1634b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i10) {
                        parcel2.writeInt(this.f1633a);
                        this.f1634b.writeToParcel(parcel2, i10);
                    }
                };
            case 1:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                if (extras != null) {
                    extras.setClassLoader(AbstractC0222a.class.getClassLoader());
                    mediaUri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                } else {
                    mediaUri = null;
                }
                if (mediaUri == null) {
                    bundle = extras;
                } else if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                    bundle = null;
                } else {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = extras;
                }
                if (mediaUri == null) {
                    mediaUri = mediaDescription.getMediaUri();
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
                mediaDescriptionCompat.f1643j = objCreateFromParcel;
                return mediaDescriptionCompat;
            case 2:
                return new MediaMetadataCompat(parcel);
            case 3:
                return new RatingCompat(parcel.readFloat(), parcel.readInt());
            case 4:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new C0220a(4);

                    /* renamed from: a */
                    public final MediaDescriptionCompat f1648a;

                    /* renamed from: b */
                    public final long f1649b;

                    {
                        this.f1648a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f1649b = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("MediaSession.QueueItem {Description=");
                        sb2.append(this.f1648a);
                        sb2.append(", Id=");
                        return AbstractC0030c.m116g(this.f1649b, " }", sb2);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i10) {
                        this.f1648a.writeToParcel(parcel2, i10);
                        parcel2.writeLong(this.f1649b);
                    }
                };
            case 5:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f1650a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 6:
                final Parcelable parcelable = parcel.readParcelable(null);
                return new Parcelable(parcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new C0220a(6);

                    /* renamed from: a */
                    public final Object f1651a;

                    {
                        this.f1651a = parcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        Object obj2 = ((MediaSessionCompat$Token) obj).f1651a;
                        Object obj3 = this.f1651a;
                        if (obj3 == null) {
                            return obj2 == null;
                        }
                        if (obj2 == null) {
                            return false;
                        }
                        return obj3.equals(obj2);
                    }

                    public final int hashCode() {
                        Object obj = this.f1651a;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i10) {
                        parcel2.writeParcelable((Parcelable) this.f1651a, i10);
                    }
                };
            case 7:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f1652a = parcel.readInt();
                parcelableVolumeInfo.f1654c = parcel.readInt();
                parcelableVolumeInfo.f1655d = parcel.readInt();
                parcelableVolumeInfo.f1656e = parcel.readInt();
                parcelableVolumeInfo.f1653b = parcel.readInt();
                return parcelableVolumeInfo;
            case 8:
                return new PlaybackStateCompat(parcel);
            case 9:
                return new C0337b(parcel);
            case 10:
                return new C0338c(parcel);
            case 11:
                e1 e1Var = new e1();
                e1Var.f2503a = parcel.readString();
                e1Var.f2504b = parcel.readInt();
                return e1Var;
            case 12:
                l1 l1Var = new l1();
                l1Var.f2618e = null;
                l1Var.f2619f = new ArrayList();
                l1Var.f2620g = new ArrayList();
                l1Var.f2614a = parcel.createStringArrayList();
                l1Var.f2615b = parcel.createStringArrayList();
                l1Var.f2616c = (C0337b[]) parcel.createTypedArray(C0337b.CREATOR);
                l1Var.f2617d = parcel.readInt();
                l1Var.f2618e = parcel.readString();
                l1Var.f2619f = parcel.createStringArrayList();
                l1Var.f2620g = parcel.createTypedArrayList(C0338c.CREATOR);
                l1Var.f2621h = parcel.createTypedArrayList(e1.CREATOR);
                return l1Var;
            case 13:
                return new p1(parcel);
            case 14:
                return new C1338b((C1353q) parcel.readParcelable(C1353q.class.getClassLoader()), (C1353q) parcel.readParcelable(C1353q.class.getClassLoader()), (C1340d) parcel.readParcelable(C1340d.class.getClassLoader()), (C1353q) parcel.readParcelable(C1353q.class.getClassLoader()));
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new C1340d(parcel.readLong());
            case 16:
                return C1353q.m4101b(parcel.readInt(), parcel.readInt());
            case 17:
                C1543d c1543d = new C1543d();
                IBinder strongBinder = parcel.readStrongBinder();
                int i10 = BinderC1542c.f7728f;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC1541b.f7727b);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1541b)) {
                        C1540a c1540a = new C1540a();
                        c1540a.f7726e = strongBinder;
                        interfaceC1541b = c1540a;
                    } else {
                        interfaceC1541b = (InterfaceC1541b) iInterfaceQueryLocalInterface;
                    }
                }
                c1543d.f7730a = interfaceC1541b;
                return c1543d;
            case 18:
                String string = parcel.readString();
                AbstractC4154l.m8920c(string);
                int i11 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 < i11; i12++) {
                    String string2 = parcel.readString();
                    AbstractC4154l.m8920c(string2);
                    String string3 = parcel.readString();
                    AbstractC4154l.m8920c(string3);
                    linkedHashMap.put(string2, string3);
                }
                return new C2033a(string, linkedHashMap);
            case 19:
                C2533h c2533h = new C2533h(parcel);
                c2533h.f13860a = parcel.readInt();
                return c2533h;
            case 20:
                int iM11754s = AbstractC5931l.m11754s(parcel);
                while (parcel.dataPosition() < iM11754s) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        AbstractC5931l.m11753r(parcel, i13);
                    } else {
                        zM11747l3 = AbstractC5931l.m11747l(parcel, i13);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s);
                return new i0(zM11747l3);
            case 21:
                int iM11754s2 = AbstractC5931l.m11754s(parcel);
                long jM11751p = 0;
                while (parcel.dataPosition() < iM11754s2) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        AbstractC5931l.m11753r(parcel, i14);
                    } else {
                        jM11751p = AbstractC5931l.m11751p(parcel, i14);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s2);
                return new C2608w(jM11751p);
            case 22:
                int iM11754s3 = AbstractC5931l.m11754s(parcel);
                while (parcel.dataPosition() < iM11754s3) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        AbstractC5931l.m11753r(parcel, i15);
                    } else {
                        zM11747l2 = AbstractC5931l.m11747l(parcel, i15);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s3);
                return new C2609x(zM11747l2);
            case 23:
                int iM11754s4 = AbstractC5931l.m11754s(parcel);
                while (parcel.dataPosition() < iM11754s4) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        AbstractC5931l.m11753r(parcel, i16);
                    } else {
                        zM11747l = AbstractC5931l.m11747l(parcel, i16);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s4);
                return new C2596k(zM11747l);
            case 24:
                int iM11754s5 = AbstractC5931l.m11754s(parcel);
                while (parcel.dataPosition() < iM11754s5) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        AbstractC5931l.m11753r(parcel, i17);
                    } else {
                        strM11741f2 = AbstractC5931l.m11741f(parcel, i17);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s5);
                return new C2610y(strM11741f2);
            case 25:
                int iM11754s6 = AbstractC5931l.m11754s(parcel);
                byte[] bArrM11739d = null;
                byte[] bArrM11739d2 = null;
                byte[] bArrM11739d3 = null;
                while (parcel.dataPosition() < iM11754s6) {
                    int i18 = parcel.readInt();
                    char c2 = (char) i18;
                    if (c2 == 1) {
                        bArrM11739d = AbstractC5931l.m11739d(parcel, i18);
                    } else if (c2 == 2) {
                        bArrM11739d2 = AbstractC5931l.m11739d(parcel, i18);
                    } else if (c2 == 3) {
                        bArrM11739d3 = AbstractC5931l.m11739d(parcel, i18);
                    } else if (c2 != 4) {
                        AbstractC5931l.m11753r(parcel, i18);
                    } else {
                        iM11750o = AbstractC5931l.m11750o(parcel, i18);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s6);
                return new C2611z(bArrM11739d == null ? null : u0.m9650k(bArrM11739d.length, bArrM11739d), bArrM11739d2 == null ? null : u0.m9650k(bArrM11739d2.length, bArrM11739d2), bArrM11739d3 != null ? u0.m9650k(bArrM11739d3.length, bArrM11739d3) : null, iM11750o);
            case 26:
                int iM11754s7 = AbstractC5931l.m11754s(parcel);
                while (true) {
                    byte[][] bArr = null;
                    while (parcel.dataPosition() < iM11754s7) {
                        int i19 = parcel.readInt();
                        if (((char) i19) != 1) {
                            AbstractC5931l.m11753r(parcel, i19);
                        } else {
                            int iM11752q = AbstractC5931l.m11752q(parcel, i19);
                            int iDataPosition = parcel.dataPosition();
                            if (iM11752q == 0) {
                                break;
                            }
                            int i20 = parcel.readInt();
                            byte[][] bArr2 = new byte[i20][];
                            for (int i21 = 0; i21 < i20; i21++) {
                                bArr2[i21] = parcel.createByteArray();
                            }
                            parcel.setDataPosition(iDataPosition + iM11752q);
                            bArr = bArr2;
                        }
                    }
                    AbstractC5931l.m11746k(parcel, iM11754s7);
                    return new a0(bArr);
                    break;
                }
            case 27:
                int iM11754s8 = AbstractC5931l.m11754s(parcel);
                C2599n c2599n = null;
                C2600o c2600o = null;
                byte[] bArrM11739d4 = null;
                ArrayList arrayListM11745j = null;
                Double dValueOf = null;
                ArrayList arrayListM11745j2 = null;
                C1276b c1276b = null;
                Integer numValueOf = null;
                C2603r c2603r = null;
                String strM11741f3 = null;
                C2587b c2587b = null;
                String strM11741f4 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iM11754s8) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 2:
                            c2599n = (C2599n) AbstractC5931l.m11740e(parcel, i22, C2599n.CREATOR);
                            break;
                        case 3:
                            c2600o = (C2600o) AbstractC5931l.m11740e(parcel, i22, C2600o.CREATOR);
                            break;
                        case 4:
                            bArrM11739d4 = AbstractC5931l.m11739d(parcel, i22);
                            break;
                        case 5:
                            arrayListM11745j = AbstractC5931l.m11745j(parcel, i22, C1279e.CREATOR);
                            break;
                        case 6:
                            int iM11752q2 = AbstractC5931l.m11752q(parcel, i22);
                            if (iM11752q2 == 0) {
                                dValueOf = null;
                                break;
                            } else {
                                AbstractC5931l.m11755t(parcel, iM11752q2, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                                break;
                            }
                        case 7:
                            arrayListM11745j2 = AbstractC5931l.m11745j(parcel, i22, C1278d.CREATOR);
                            break;
                        case '\b':
                            c1276b = (C1276b) AbstractC5931l.m11740e(parcel, i22, C1276b.CREATOR);
                            break;
                        case '\t':
                            int iM11752q3 = AbstractC5931l.m11752q(parcel, i22);
                            if (iM11752q3 == 0) {
                                numValueOf = null;
                                break;
                            } else {
                                AbstractC5931l.m11755t(parcel, iM11752q3, 4);
                                numValueOf = Integer.valueOf(parcel.readInt());
                                break;
                            }
                        case '\n':
                            c2603r = (C2603r) AbstractC5931l.m11740e(parcel, i22, C2603r.CREATOR);
                            break;
                        case 11:
                            strM11741f3 = AbstractC5931l.m11741f(parcel, i22);
                            break;
                        case '\f':
                            c2587b = (C2587b) AbstractC5931l.m11740e(parcel, i22, C2587b.CREATOR);
                            break;
                        case '\r':
                            strM11741f4 = AbstractC5931l.m11741f(parcel, i22);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) AbstractC5931l.m11740e(parcel, i22, ResultReceiver.CREATOR);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i22);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s8);
                return new C1277c(c2599n, c2600o, bArrM11739d4, arrayListM11745j, dValueOf, arrayListM11745j2, c1276b, numValueOf, c2603r, strM11741f3, c2587b, strM11741f4, resultReceiver);
            case 28:
                int iM11754s9 = AbstractC5931l.m11754s(parcel);
                String strM11741f5 = null;
                String strM11741f6 = null;
                byte[] bArrM11739d5 = null;
                C2591f c2591f = null;
                C2590e c2590e = null;
                C1275a c1275a = null;
                C2588c c2588c = null;
                String strM11741f7 = null;
                while (parcel.dataPosition() < iM11754s9) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            strM11741f5 = AbstractC5931l.m11741f(parcel, i23);
                            break;
                        case 2:
                            strM11741f6 = AbstractC5931l.m11741f(parcel, i23);
                            break;
                        case 3:
                            bArrM11739d5 = AbstractC5931l.m11739d(parcel, i23);
                            break;
                        case 4:
                            c2591f = (C2591f) AbstractC5931l.m11740e(parcel, i23, C2591f.CREATOR);
                            break;
                        case 5:
                            c2590e = (C2590e) AbstractC5931l.m11740e(parcel, i23, C2590e.CREATOR);
                            break;
                        case 6:
                            c1275a = (C1275a) AbstractC5931l.m11740e(parcel, i23, C1275a.CREATOR);
                            break;
                        case 7:
                            c2588c = (C2588c) AbstractC5931l.m11740e(parcel, i23, C2588c.CREATOR);
                            break;
                        case '\b':
                            strM11741f7 = AbstractC5931l.m11741f(parcel, i23);
                            break;
                        case '\t':
                            AbstractC5931l.m11741f(parcel, i23);
                            break;
                        default:
                            AbstractC5931l.m11753r(parcel, i23);
                            break;
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s9);
                return new C2597l(strM11741f5, strM11741f6, bArrM11739d5, c2591f, c2590e, c1275a, c2588c, strM11741f7);
            default:
                int iM11754s10 = AbstractC5931l.m11754s(parcel);
                byte[] bArrM11739d6 = null;
                ArrayList arrayListM11745j3 = null;
                while (parcel.dataPosition() < iM11754s10) {
                    int i24 = parcel.readInt();
                    char c10 = (char) i24;
                    if (c10 == 2) {
                        strM11741f = AbstractC5931l.m11741f(parcel, i24);
                    } else if (c10 == 3) {
                        bArrM11739d6 = AbstractC5931l.m11739d(parcel, i24);
                    } else if (c10 != 4) {
                        AbstractC5931l.m11753r(parcel, i24);
                    } else {
                        arrayListM11745j3 = AbstractC5931l.m11745j(parcel, i24, Transport.CREATOR);
                    }
                }
                AbstractC5931l.m11746k(parcel, iM11754s10);
                return new C1278d(strM11741f, arrayListM11745j3, bArrM11739d6);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f1647a) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i10];
            case 1:
                return new MediaDescriptionCompat[i10];
            case 2:
                return new MediaMetadataCompat[i10];
            case 3:
                return new RatingCompat[i10];
            case 4:
                return new MediaSessionCompat$QueueItem[i10];
            case 5:
                return new MediaSessionCompat$ResultReceiverWrapper[i10];
            case 6:
                return new MediaSessionCompat$Token[i10];
            case 7:
                return new ParcelableVolumeInfo[i10];
            case 8:
                return new PlaybackStateCompat[i10];
            case 9:
                return new C0337b[i10];
            case 10:
                return new C0338c[i10];
            case 11:
                return new e1[i10];
            case 12:
                return new l1[i10];
            case 13:
                return new p1[i10];
            case 14:
                return new C1338b[i10];
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new C1340d[i10];
            case 16:
                return new C1353q[i10];
            case 17:
                return new C1543d[i10];
            case 18:
                return new C2033a[i10];
            case 19:
                return new C2533h[i10];
            case 20:
                return new i0[i10];
            case 21:
                return new C2608w[i10];
            case 22:
                return new C2609x[i10];
            case 23:
                return new C2596k[i10];
            case 24:
                return new C2610y[i10];
            case 25:
                return new C2611z[i10];
            case 26:
                return new a0[i10];
            case 27:
                return new C1277c[i10];
            case 28:
                return new C2597l[i10];
            default:
                return new C1278d[i10];
        }
    }
}
