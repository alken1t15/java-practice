public class SdvirArray {
    public static void main(String[] args) {
        long[] arr;
        arr = new long[100]; // Создание массива
        int nElems = 0; // Количество элементов
        int j; // Счетчик цикла
        long searchKey;
        arr[0] = 77; // Вставка 10 элементов
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        nElems = 10;
        searchKey = 55; // Удаление элемента с ключом 55
        for(j=0; j<nElems; j++) // Поиск удаляемого элемента
            if(arr[j] == searchKey)
                break;
        for(int k=j; k<nElems-1; k++) // Сдвиг последующих элементов
            arr[k] = arr[k+1];
        nElems--;
        for(j=0; j<nElems; j++) // Вывод элементов
            System.out.print( arr[j] + " ");
        System.out.println("");
    }
    }
