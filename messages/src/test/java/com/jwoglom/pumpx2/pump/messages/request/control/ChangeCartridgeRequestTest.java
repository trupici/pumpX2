package com.jwoglom.pumpx2.pump.messages.request.control;

import static com.jwoglom.pumpx2.pump.messages.MessageTester.assertHexEquals;

import com.jwoglom.pumpx2.pump.messages.MessageTester;
import com.jwoglom.pumpx2.pump.messages.bluetooth.CharacteristicUUID;
import com.jwoglom.pumpx2.pump.messages.request.control.ChangeCartridgeRequest;

import org.apache.commons.codec.DecoderException;
import org.junit.Ignore;
import org.junit.Test;

public class ChangeCartridgeRequestTest {
    @Test
    @Ignore("WIP")
    public void testChangeCartridgeRequest() throws DecoderException {
        // empty cargo
        ChangeCartridgeRequest expected = new ChangeCartridgeRequest();

        ChangeCartridgeRequest parsedReq = (ChangeCartridgeRequest) MessageTester.test(
                "00049004006178",
                4,
                1,
                CharacteristicUUID.CONTROL_CHARACTERISTICS,
                expected
        );

        assertHexEquals(expected.getCargo(), parsedReq.getCargo());
    }
}