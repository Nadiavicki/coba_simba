import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenstrualCycleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the last menstrual period (LMP) date (yyyy-mm-dd): ");
        String lmpInput = scanner.next();
        LocalDate lmp = LocalDate.parse(lmpInput);

        System.out.print("Enter the average menstrual cycle length (in days): ");
        int cycleLength = scanner.nextInt();

        LocalDate nextMenstrualPeriod = calculateNextMenstrualPeriod(lmp, cycleLength);
        LocalDate ovulationDate = calculateOvulationDate(nextMenstrualPeriod);
        LocalDate fertileWindowStart = calculateFertileWindowStart(ovulationDate);
        LocalDate fertileWindowEnd = calculateFertileWindowEnd(ovulationDate);

        System.out.println("Next Menstrual Period: " + nextMenstrualPeriod);
        System.out.println("Ovulation Date: " + ovulationDate);
        System.out.println("Fertile Window: " + fertileWindowStart + " - " + fertileWindowEnd);
    }

    private static LocalDate calculateNextMenstrualPeriod(LocalDate lmp, int cycleLength) {
        return lmp.plusDays(cycleLength);
    }

    private static LocalDate calculateOvulationDate(LocalDate nextMenstrualPeriod) {
        return nextMenstrualPeriod.minusDays(14); // assuming ovulation occurs 14 days after the last menstrual period
    }

    private static LocalDate calculateFertileWindowStart(LocalDate ovulationDate) {
        return ovulationDate.minusDays(4); // assuming fertile window starts 4 days before ovulation
    }

    private static LocalDate calculateFertileWindowEnd(LocalDate ovulationDate) {
        return ovulationDate.plusDays(1); // assuming fertile window ends 1 day after ovulation
    }
}