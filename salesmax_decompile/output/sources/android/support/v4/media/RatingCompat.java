package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C1702a();

    /* renamed from: a */
    public final int f5142a;

    /* renamed from: b */
    public final float f5143b;

    /* renamed from: c */
    public Object f5144c;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    public class C1702a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.RatingCompat$b */
    public static class C1703b {
        /* renamed from: a */
        public static float m3508a(Rating rating) {
            return rating.getPercentRating();
        }

        /* renamed from: b */
        public static int m3509b(Rating rating) {
            return rating.getRatingStyle();
        }

        /* renamed from: c */
        public static float m3510c(Rating rating) {
            return rating.getStarRating();
        }

        /* renamed from: d */
        public static boolean m3511d(Rating rating) {
            return rating.hasHeart();
        }

        /* renamed from: e */
        public static boolean m3512e(Rating rating) {
            return rating.isRated();
        }

        /* renamed from: f */
        public static boolean m3513f(Rating rating) {
            return rating.isThumbUp();
        }

        /* renamed from: g */
        public static Rating m3514g(boolean z) {
            return Rating.newHeartRating(z);
        }

        /* renamed from: h */
        public static Rating m3515h(float f) {
            return Rating.newPercentageRating(f);
        }

        /* renamed from: i */
        public static Rating m3516i(int i, float f) {
            return Rating.newStarRating(i, f);
        }

        /* renamed from: j */
        public static Rating m3517j(boolean z) {
            return Rating.newThumbRating(z);
        }

        /* renamed from: k */
        public static Rating m3518k(int i) {
            return Rating.newUnratedRating(i);
        }
    }

    public RatingCompat(int i, float f) {
        this.f5142a = i;
        this.f5143b = f;
    }

    /* renamed from: a */
    public static RatingCompat m3500a(Object obj) {
        RatingCompat ratingCompatM3505f = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int iM3509b = C1703b.m3509b(rating);
            if (C1703b.m3512e(rating)) {
                switch (iM3509b) {
                    case 1:
                        ratingCompatM3505f = m3501b(C1703b.m3511d(rating));
                        break;
                    case 2:
                        ratingCompatM3505f = m3504e(C1703b.m3513f(rating));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompatM3505f = m3503d(iM3509b, C1703b.m3510c(rating));
                        break;
                    case 6:
                        ratingCompatM3505f = m3502c(C1703b.m3508a(rating));
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompatM3505f = m3505f(iM3509b);
            }
            ratingCompatM3505f.f5144c = obj;
        }
        return ratingCompatM3505f;
    }

    /* renamed from: b */
    public static RatingCompat m3501b(boolean z) {
        return new RatingCompat(1, z ? 1.0f : 0.0f);
    }

    /* renamed from: c */
    public static RatingCompat m3502c(float f) {
        if (f < 0.0f || f > 100.0f) {
            return null;
        }
        return new RatingCompat(6, f);
    }

    /* renamed from: d */
    public static RatingCompat m3503d(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else {
            if (i != 5) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid rating style (");
                sb.append(i);
                sb.append(") for a star rating");
                return null;
            }
            f2 = 5.0f;
        }
        if (f < 0.0f || f > f2) {
            return null;
        }
        return new RatingCompat(i, f);
    }

    /* renamed from: e */
    public static RatingCompat m3504e(boolean z) {
        return new RatingCompat(2, z ? 1.0f : 0.0f);
    }

    /* renamed from: f */
    public static RatingCompat m3505f(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f5142a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f5142a);
        sb.append(" rating=");
        float f = this.f5143b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5142a);
        parcel.writeFloat(this.f5143b);
    }
}
