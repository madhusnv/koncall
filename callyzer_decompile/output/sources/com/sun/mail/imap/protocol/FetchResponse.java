package com.sun.mail.imap.protocol;

import com.amplifyframework.core.model.ModelIdentifier;
import com.sun.mail.iap.ParsingException;
import com.sun.mail.iap.Protocol;
import com.sun.mail.iap.Response;
import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class FetchResponse extends IMAPResponse {
    private static final char[] HEADER = {'.', 'H', 'E', 'A', 'D', 'E', Matrix.MATRIX_TYPE_RANDOM_REGULAR};
    private static final char[] TEXT = {'.', 'T', 'E', 'X', 'T'};
    private Map<String, Object> extensionItems;
    private final FetchItem[] fitems;
    private Item[] items;

    public FetchResponse(Protocol protocol) throws ParsingException {
        super(protocol);
        this.fitems = null;
        parse();
    }

    public static <T extends Item> List<T> getItems(Response[] responseArr, int i10, Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        if (responseArr != null) {
            for (int i11 = 0; i11 < responseArr.length; i11++) {
                Response response = responseArr[i11];
                if (response != null && (response instanceof FetchResponse) && ((FetchResponse) response).getNumber() == i10) {
                    FetchResponse fetchResponse = (FetchResponse) responseArr[i11];
                    int i12 = 0;
                    while (true) {
                        Item[] itemArr = fetchResponse.items;
                        if (i12 < itemArr.length) {
                            if (cls.isInstance(itemArr[i12])) {
                                arrayList.add(cls.cast(fetchResponse.items[i12]));
                            }
                            i12++;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private boolean match(char[] cArr) {
        int length = cArr.length;
        int i10 = this.index;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i10 + 1;
            int i13 = i11 + 1;
            if (Character.toUpperCase((char) this.buffer[i10]) != cArr[i11]) {
                return false;
            }
            i11 = i13;
            i10 = i12;
        }
        this.index += length;
        return true;
    }

    private String next20() {
        int i10 = this.index;
        int i11 = i10 + 20;
        int i12 = this.size;
        if (i11 > i12) {
            return ASCIIUtility.toString(this.buffer, i10, i12);
        }
        StringBuilder sb2 = new StringBuilder();
        byte[] bArr = this.buffer;
        int i13 = this.index;
        sb2.append(ASCIIUtility.toString(bArr, i13, i13 + 20));
        sb2.append("...");
        return sb2.toString();
    }

    private void parse() throws ParsingException {
        if (!isNextNonSpace('(')) {
            throw new ParsingException("error in FETCH parsing, missing '(' at index " + this.index);
        }
        ArrayList arrayList = new ArrayList();
        skipSpaces();
        while (this.index < this.size) {
            Item item = parseItem();
            if (item != null) {
                arrayList.add(item);
            } else if (!parseExtensionItem()) {
                StringBuilder sb2 = new StringBuilder("error in FETCH parsing, unrecognized item at index ");
                sb2.append(this.index);
                sb2.append(", starts with \"");
                throw new ParsingException(AbstractC1452a.m4564k(sb2, next20(), ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR));
            }
            if (isNextNonSpace(')')) {
                this.items = (Item[]) arrayList.toArray(new Item[arrayList.size()]);
                return;
            }
        }
        throw new ParsingException("error in FETCH parsing, ran off end of buffer, size " + this.size);
    }

    private boolean parseExtensionItem() {
        if (this.fitems == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            FetchItem[] fetchItemArr = this.fitems;
            if (i10 >= fetchItemArr.length) {
                return false;
            }
            if (match(fetchItemArr[i10].getName())) {
                if (this.extensionItems == null) {
                    this.extensionItems = new HashMap();
                }
                this.extensionItems.put(this.fitems[i10].getName(), this.fitems[i10].parseItem(this));
                return true;
            }
            i10++;
        }
    }

    private Item parseItem() {
        boolean z6;
        byte b10 = this.buffer[this.index];
        if (b10 != 66) {
            if (b10 != 73) {
                if (b10 != 77) {
                    if (b10 != 82) {
                        if (b10 != 85) {
                            if (b10 != 98) {
                                if (b10 != 105) {
                                    if (b10 != 109) {
                                        if (b10 != 114) {
                                            if (b10 != 117) {
                                                if (b10 != 69) {
                                                    if (b10 != 70) {
                                                        if (b10 != 101) {
                                                            if (b10 != 102) {
                                                                return null;
                                                            }
                                                        }
                                                    }
                                                    if (match(FLAGS.name)) {
                                                        return new FLAGS(this);
                                                    }
                                                    return null;
                                                }
                                                if (match(ENVELOPE.name)) {
                                                    return new ENVELOPE(this);
                                                }
                                                return null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (match(UID.name)) {
                            return new UID(this);
                        }
                        return null;
                    }
                    if (match(RFC822SIZE.name)) {
                        return new RFC822SIZE(this);
                    }
                    if (!match(RFC822DATA.name)) {
                        return null;
                    }
                    if (match(HEADER)) {
                        z6 = true;
                    } else {
                        match(TEXT);
                        z6 = false;
                    }
                    return new RFC822DATA(this, z6);
                }
                if (match(MODSEQ.name)) {
                    return new MODSEQ(this);
                }
                return null;
            }
            if (match(INTERNALDATE.name)) {
                return new INTERNALDATE(this);
            }
            return null;
        }
        if (match(BODYSTRUCTURE.name)) {
            return new BODYSTRUCTURE(this);
        }
        if (match(BODY.name)) {
            return this.buffer[this.index] == 91 ? new BODY(this) : new BODYSTRUCTURE(this);
        }
        return null;
    }

    public Map<String, Object> getExtensionItems() {
        return this.extensionItems;
    }

    public Item getItem(int i10) {
        return this.items[i10];
    }

    public int getItemCount() {
        return this.items.length;
    }

    public <T extends Item> T getItem(Class<T> cls) {
        int i10 = 0;
        while (true) {
            Item[] itemArr = this.items;
            if (i10 >= itemArr.length) {
                return null;
            }
            if (cls.isInstance(itemArr[i10])) {
                return cls.cast(this.items[i10]);
            }
            i10++;
        }
    }

    public FetchResponse(IMAPResponse iMAPResponse) {
        this(iMAPResponse, null);
    }

    public FetchResponse(IMAPResponse iMAPResponse, FetchItem[] fetchItemArr) throws ParsingException {
        super(iMAPResponse);
        this.fitems = fetchItemArr;
        parse();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x003a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T extends com.sun.mail.imap.protocol.Item> T getItem(com.sun.mail.iap.Response[] r7, int r8, java.lang.Class<T> r9) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            r1 = 0
            r2 = r1
        L6:
            int r3 = r7.length
            if (r2 >= r3) goto L3d
            r3 = r7[r2]
            if (r3 == 0) goto L3a
            boolean r4 = r3 instanceof com.sun.mail.imap.protocol.FetchResponse
            if (r4 == 0) goto L3a
            com.sun.mail.imap.protocol.FetchResponse r3 = (com.sun.mail.imap.protocol.FetchResponse) r3
            int r3 = r3.getNumber()
            if (r3 == r8) goto L1a
            goto L3a
        L1a:
            r3 = r7[r2]
            com.sun.mail.imap.protocol.FetchResponse r3 = (com.sun.mail.imap.protocol.FetchResponse) r3
            r4 = r1
        L1f:
            com.sun.mail.imap.protocol.Item[] r5 = r3.items
            int r6 = r5.length
            if (r4 >= r6) goto L3a
            r5 = r5[r4]
            boolean r5 = r9.isInstance(r5)
            if (r5 == 0) goto L37
            com.sun.mail.imap.protocol.Item[] r7 = r3.items
            r7 = r7[r4]
            java.lang.Object r7 = r9.cast(r7)
            com.sun.mail.imap.protocol.Item r7 = (com.sun.mail.imap.protocol.Item) r7
            return r7
        L37:
            int r4 = r4 + 1
            goto L1f
        L3a:
            int r2 = r2 + 1
            goto L6
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.imap.protocol.FetchResponse.getItem(com.sun.mail.iap.Response[], int, java.lang.Class):com.sun.mail.imap.protocol.Item");
    }

    private boolean match(String str) {
        int length = str.length();
        int i10 = this.index;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i10 + 1;
            int i13 = i11 + 1;
            if (Character.toUpperCase((char) this.buffer[i10]) != str.charAt(i11)) {
                return false;
            }
            i11 = i13;
            i10 = i12;
        }
        this.index += length;
        return true;
    }
}
