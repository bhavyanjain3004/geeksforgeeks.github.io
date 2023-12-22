class Main {
  String average( intA[], int N ){
    double Sum = 0;
    for( int i=0; i<N ; i++) {
      Sum += A[i];
    }
    double avg = (double)Sum/N;
    String str = string.format ("%2f" avg);
    return str;
  }
}
