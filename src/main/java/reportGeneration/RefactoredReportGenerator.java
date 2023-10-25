package reportGeneration;

public class RefactoredReportGenerator {
    private ReportFormatter formatter;

    public RefactoredReportGenerator(ReportFormatter formatter) {
        this.formatter = formatter;
    }

    public void setFormatter(ReportFormatter formatter) {
        this.formatter = formatter;
    }

    public void generate(Report report) {
        String formattedReport = formatter.formatReport(report);
        System.out.println(formattedReport);
    }

}
