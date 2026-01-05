package com.sun.mail.imap.protocol;

import com.sun.mail.iap.ParsingException;
import com.sun.mail.imap.IMAPStore;
import jakarta.mail.internet.C3660i;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class INTERNALDATE implements Item {
    protected Date date;
    public int msgno;
    static final char[] name = {'I', 'N', 'T', 'E', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'N', 'A', Matrix.MATRIX_TYPE_RANDOM_LT, 'D', 'A', 'T', 'E'};
    private static final C3660i mailDateFormat = new C3660i();

    /* renamed from: df, reason: collision with root package name */
    private static SimpleDateFormat f43924df = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss ", Locale.US);

    public INTERNALDATE(FetchResponse fetchResponse) throws ParsingException {
        this.msgno = fetchResponse.getNumber();
        fetchResponse.skipSpaces();
        String string = fetchResponse.readString();
        if (string == null) {
            throw new ParsingException("INTERNALDATE is NIL");
        }
        try {
            C3660i c3660i = mailDateFormat;
            synchronized (c3660i) {
                this.date = c3660i.parse(string);
            }
        } catch (ParseException unused) {
            throw new ParsingException("INTERNALDATE parse error");
        }
    }

    public static String format(Date date) {
        StringBuffer stringBuffer = new StringBuffer();
        synchronized (f43924df) {
            f43924df.format(date, stringBuffer, new FieldPosition(0));
        }
        int offset = (TimeZone.getDefault().getOffset(date.getTime()) / 60) / IMAPStore.RESPONSE;
        if (offset < 0) {
            stringBuffer.append('-');
            offset = -offset;
        } else {
            stringBuffer.append('+');
        }
        int i10 = offset / 60;
        int i11 = offset % 60;
        stringBuffer.append(Character.forDigit(i10 / 10, 10));
        stringBuffer.append(Character.forDigit(i10 % 10, 10));
        stringBuffer.append(Character.forDigit(i11 / 10, 10));
        stringBuffer.append(Character.forDigit(i11 % 10, 10));
        return stringBuffer.toString();
    }

    public Date getDate() {
        return this.date;
    }
}
