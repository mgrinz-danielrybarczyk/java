package statics;

import java.util.Scanner;

public class Drawing {

    // Zmienne globalne
    public static int screenHeight = 100;

    // Zmienne do obsługi płótna
    public static int canvasHeight;
    public static int canvasWidth;
    public static String canvasBorder;
    public static String canvas = "";

    // Zmienne do obsługi menu
    public static final int exitOption = 1;
    public static String exitOptionLabel = "Zakończ";
    public static final int redrawLineOption = 2;
    public static String redrawLineOptionLabel = "Popraw linię";
    public static final int showCanvasOption = 3;
    public static String showCanvasOptionLabel = "Pokaż płótno";

    public static void main(String[] args) {

        System.out.println("*** RYSOWANIE W KONSOLI ***");
        System.out.println();
        setCanvasSize();
        setCanvasBorder();
        showCanvasExample();
        drawCanvas();
        showCanvas();

        while (true) {
            clearScreen();
            showMenu();
            int option = getUserOption();
            if (option == exitOption) {
                clearScreen();
                System.out.println("Do zobaczenia!");
                break;
            }
            executeOption(option);
            getUserConfirm();
        }
    }

    public static void executeOption(int option) {
        switch (option) {
            case showCanvasOption:
                showCanvas();
                break;
            case redrawLineOption:
                redrawLine();
                break;
            default:
                break;
        }
    }

    public static void redrawLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj numer linii do przerysowania (od 1 do " + canvasHeight + "): ");
        int lineNumber;
        do {
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.print("Podaj numer linii do przerysowania (od 1 do " + canvasHeight + "): ");
            }
            lineNumber = scanner.nextInt() - 1;
        } while (lineNumber < 0 || lineNumber >= canvasHeight);

        System.out.println();
        redrawCanvas(lineNumber);
        changeLine(lineNumber);
        System.out.println();
    }

    public static void changeLine(int lineNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(canvasBorder);
        String line = scanner.nextLine();
        line = prepareLine(line);
        if (lineNumber == 0) {
            canvas = line + canvas.substring(canvasWidth);
        } else if (lineNumber == canvasHeight - 1) {
            canvas = canvas.substring(0, canvasWidth * (canvasHeight - 1)) + line;
        } else {
            String canvasFirstPart = canvas.substring(0, (lineNumber * canvasWidth));
            String canvasSecondPart = canvas.substring((lineNumber + 1) * canvasWidth);
            canvas = canvasFirstPart + line + canvasSecondPart;
        }
    }

    public static String prepareLine(String line) {
        if (line.length() > canvasWidth) {
            line = line.substring(0, canvasWidth);
        }
        if (line.length() < canvasWidth) {
            line = fillLineToWidth(line);
        }
        return line;
    }

    public static void showMenu() {
        System.out.println("Co chcesz zrobić? Wybierz jedną z opcji:");
        System.out.println("\t" + exitOption + ") " + exitOptionLabel);
        System.out.println("\t" + redrawLineOption + ") " + redrawLineOptionLabel);
        System.out.println("\t" + showCanvasOption + ") " + showCanvasOptionLabel);
        System.out.println();
    }

    public static int getUserOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Twój wybór: ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print("Twój wybór: ");
        }
        return scanner.nextInt();
    }

    public static void setCanvasSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj szerokość płótna (w kolumnach): ");
        canvasWidth = scanner.nextInt();
        System.out.print("Podaj wysokość płótna (w liniach): ");
        canvasHeight = scanner.nextInt();
    }

    public static void setCanvasBorder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj symbol dla ramki (pojedynczy): ");
        canvasBorder = scanner.nextLine().substring(0, 1);
    }

    public static void showCanvasExample() {
        System.out.println("Twoje płótno:\n");
        drawBorderLine();
        for (int i = 0; i < canvasHeight; i++) {
            drawEmptyBodyLine();
        }
        drawBorderLine();
        getUserConfirm();
    }

    public static void getUserConfirm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n Dalej? ");
        scanner.nextLine();
    }

    public static void drawBorderLine() {
        String line = canvasBorder;
        for (int i = 0; i < canvasWidth; i++) {
            line += canvasBorder;
        }
        line += canvasBorder;
        System.out.println(line);
    }

    public static void drawEmptyBodyLine() {
        String line = canvasBorder;
        for (int i = 0; i < canvasWidth; i++) {
            line += " ";
        }
        line += canvasBorder;
        System.out.println(line);
    }

    public static void drawCanvas() {
        clearScreen();
        System.out.println("Rozpocznij rysowanie: \n");
        drawBorderLine();
        for (int i = 0; i < canvasHeight; i++) {
            getLine();
            clearScreen();
            redrawCanvas(i + 1);
        }
        drawBorderLine();
    }

    public static void clearScreen() {
        String clearingLine = "";
        for (int i = 0; i < screenHeight; i++) {
            clearingLine += "\n";
        }
        System.out.println(clearingLine);
    }

    public static void getLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(canvasBorder);
        String line = scanner.nextLine();
        line = prepareLine(line);
        canvas += line;
    }

    public static String fillLineToWidth(String line) {
        String filler = "";
        for (int i = line.length(); i < canvasWidth; i++) {
            filler += " ";
        }
        return line + filler;
    }

    public static void redrawCanvas(int lineLimit) {
        drawBorderLine();
        for (int i = 0; i < lineLimit; i++) {
            String line = canvasBorder;
            line += getCanvasLine(i);
            line += canvasBorder;
            System.out.println(line);
        }
    }

    public static String getCanvasLine(int lineNumber) {
        return canvas.substring(canvasWidth * lineNumber, canvasWidth * (lineNumber + 1));
    }

    public static void showCanvas() {
        clearScreen();
        System.out.println("Twój obrazek: \n\n");
        redrawCanvas(canvasHeight);
        drawBorderLine();
    }
}
