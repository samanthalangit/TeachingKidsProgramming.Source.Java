package org.teachingextensions.approvals.lite.reporters.windows;

import org.teachingextensions.approvals.lite.reporters.GenericDiffReporter;

import java.text.MessageFormat;

public class BeyondCompareReporter extends GenericDiffReporter {
    public static final BeyondCompareReporter INSTANCE = new BeyondCompareReporter();
    static final String DIFF_PROGRAM = "C:\\Program Files\\Beyond Compare 3\\BCompare.exe";
    static final String MESSAGE = MessageFormat.format(
            "Unable to find Beyond Compare at {0}", DIFF_PROGRAM);

    public BeyondCompareReporter() {
        super(DIFF_PROGRAM, MESSAGE);
    }
}
