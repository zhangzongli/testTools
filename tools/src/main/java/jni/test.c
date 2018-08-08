#include "tea.h"
#include "string.h"
#include "jni.h"
#include "NativeForC.h"
#include <stdio.h>

#define MX                (z>>5^y<<2)+(y>>3^z<<4)^(sum^y)+(k[p&3^e]^z)
#define DELTA             0x9e3779b9
#define S_LOOPTIME        1        //5
#define BLOCK_SIZE        50  

//extern unsigned char TX_buffer[1024];

JNIEXPORT void JNICALL Java_NativeForC_test(JNIEnv *env,jobject obj){
    printf("���ܿ�ʼ111\n");
    unsigned char TEA_key[16]=
	{ 
	    0x01,0x02,0x03,0x04,0x05,0x06,0x07,0x08,
	    0x09,0x0A,0x0B,0x0C,0x0D,0x0E,0x0F,0x10
	};
	unsigned char TX_buffer[50] = {"pro:1234567"};
//	btea_encrypt(TX_buffer, TEA_key);
//	for (int i = 0; i < 50; i++) {
//	    printf("%c\n", &TX_buffer[i])
//	}
//	printf("pro:1234567\n")
    return;
}

void btea_encrypt( unsigned char* buf, unsigned char* key )
{
    unsigned char n=BLOCK_SIZE/4;
	//unsigned char n=strlen((char*)TX_buffer)/4;
    unsigned long *v=(unsigned long *)buf;
    unsigned long *k=(unsigned long *)key;
    unsigned long z = v[n - 1],y = v[0],sum = 0,e ;
    unsigned char p,q ;
    // Coding Part 
    
    q = S_LOOPTIME + 52 / n ;
    while ( q-- > 0 )
    {
        sum += DELTA ;
        e = sum >> 2 & 3 ;
        for ( p = 0 ; p < n - 1 ; p++ )
          y = v[p + 1],
          z = v[p] += MX;
          y = v[0] ;
        z = v[n - 1] += MX;
    }
}


/*
*key  maybe 128bit =16Bytes.
*buf  maybe BLOCK_SIZE
inbuf == outbuf == buf
*/

void btea_decrpyt( unsigned char* buf, unsigned char* key )
{
    unsigned char n=BLOCK_SIZE/4;
    unsigned long *v=(unsigned long *)buf;
    unsigned long *k=(unsigned long *)key;
    unsigned long z = v[n - 1],y = v[0],sum = 0,e ;
    unsigned char  p,q ;
    
    //Decoding Part...
    q = S_LOOPTIME + 52 / n ;
    sum = q * DELTA ;
    while ( sum != 0 )
    {
        e = sum >> 2 & 3 ;
        for ( p = n - 1 ; p > 0 ; p-- )
            z = v[p - 1],
            y = v[p] -= MX;
            z = v[n - 1] ;
        y = v[0] -= MX;
        sum -= DELTA ;
    }
}