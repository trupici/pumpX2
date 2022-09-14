package com.jwoglom.pumpx2.pump.messages.response.historyLog;

import static com.jwoglom.pumpx2.pump.messages.MessageTester.assertHexEquals;

import com.jwoglom.pumpx2.pump.messages.MessageTester;
import com.jwoglom.pumpx2.pump.messages.bluetooth.CharacteristicUUID;
import com.jwoglom.pumpx2.pump.messages.response.historyLog.UsbEnumeratedHistoryLog;

import com.google.common.collect.ImmutableList;
import org.apache.commons.codec.DecoderException;
import org.junit.Test;

public class UsbEnumeratedHistoryLogTest {
    @Test
    public void testUsbEnumeratedHistoryLog() throws DecoderException {
        UsbEnumeratedHistoryLog expected = new UsbEnumeratedHistoryLog(
            // int negotiatedCurrentMilliAmps
        );

        UsbEnumeratedHistoryLog parsedRes = (UsbEnumeratedHistoryLog) HistoryLogMessageTester.testSingle(
                "xxxx",
                expected
        );
        assertHexEquals(expected.getCargo(), parsedRes.getCargo());
    }
}