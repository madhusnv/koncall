package org.apache.http.impl.conn;

import com.google.android.gms.common.api.Api;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponseFactory;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.params.ConnConnectionPNames;
import org.apache.http.impl.io.AbstractMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;
import p001o.eja;
import p001o.sia;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
@Deprecated
/* loaded from: classes6.dex */
public class DefaultResponseParser extends AbstractMessageParser<HttpMessage> {
    private final CharArrayBuffer lineBuf;
    private final sia log;
    private final int maxGarbageLines;
    private final HttpResponseFactory responseFactory;

    public DefaultResponseParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        super(sessionInputBuffer, lineParser, httpParams);
        eja.m25143k(getClass());
        Args.notNull(httpResponseFactory, "Response factory");
        this.responseFactory = httpResponseFactory;
        this.lineBuf = new CharArrayBuffer(128);
        this.maxGarbageLines = getMaxGarbageLines(httpParams);
    }

    public int getMaxGarbageLines(HttpParams httpParams) {
        return httpParams.getIntParameter(ConnConnectionPNames.MAX_STATUS_LINE_GARBAGE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @Override // org.apache.http.impl.io.AbstractMessageParser
    public HttpMessage parseHead(SessionInputBuffer sessionInputBuffer) throws ProtocolException, NoHttpResponseException {
        this.lineBuf.clear();
        int line = sessionInputBuffer.readLine(this.lineBuf);
        if (line == -1) {
            throw new NoHttpResponseException("The target server failed to respond");
        }
        ParserCursor parserCursor = new ParserCursor(0, this.lineBuf.length());
        if (this.lineParser.hasProtocolVersion(this.lineBuf, parserCursor)) {
            return this.responseFactory.newHttpResponse(this.lineParser.parseStatusLine(this.lineBuf, parserCursor), null);
        }
        if (line == -1 || this.maxGarbageLines <= 0) {
            throw new ProtocolException("The server failed to respond with a valid HTTP response");
        }
        throw null;
    }
}
